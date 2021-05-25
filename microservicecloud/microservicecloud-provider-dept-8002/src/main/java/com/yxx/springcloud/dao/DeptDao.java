package com.yxx.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yxx.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	//增加部门
	public boolean addDept(Dept dept);
	//查找部门
	public Dept findById(Long id);
	//查询所有的部门
	public List<Dept> list();

}
