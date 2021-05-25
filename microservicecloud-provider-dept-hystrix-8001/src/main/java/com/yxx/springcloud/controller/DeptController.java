package com.yxx.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yxx.springcloud.entities.Dept;
import com.yxx.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptService.get(id);
		if(dept==null) {
			throw new RuntimeException();
		}
		return dept;
	}
	
	public Dept processHystrix_get(@PathVariable("id") Long id) {
		Dept dept = new Dept().setDeptno(id).setDname("没有此部门@Hystrix方法").setDb_source("没有此数据库");
		return dept;
	}
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return deptService.list();
	}

}
