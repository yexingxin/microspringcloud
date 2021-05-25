package com.yxx.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yxx.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptFeignFactoryService implements FallbackFactory<DeptFeignService>{

	@Override
	public DeptFeignService create(Throwable cause) {
		
		return new DeptFeignService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				Dept dept = new Dept().setDeptno(id).setDname("没有此部门@Hystrix方法").setDb_source("没有此数据库");
				return dept;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
