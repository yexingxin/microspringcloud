package com.yxx.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yxx.springcloud.entities.Dept;
import com.yxx.springcloud.service.DeptFeignService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptFeignService deptFeignService=null;
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		return deptFeignService.add(dept);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptFeignService.get(id);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		return deptFeignService.list();
	}

}
