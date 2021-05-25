package com.yxx.springcloud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxx.springcloud.dao.DeptDao;
import com.yxx.springcloud.entities.Dept;
import com.yxx.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.list();
	}
	

}
