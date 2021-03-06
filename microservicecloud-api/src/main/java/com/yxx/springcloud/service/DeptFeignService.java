package com.yxx.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yxx.springcloud.entities.Dept;

//@FeignClient(value="microservicecloud-dept")
@FeignClient(value="microservicecloud-dept",fallbackFactory = DeptFeignFactoryService.class)
public interface DeptFeignService {
	
	@RequestMapping(value="/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept);
	
	@RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id);
	
	@RequestMapping(value="/dept/list",method = RequestMethod.GET)
	public List<Dept> list();

}
