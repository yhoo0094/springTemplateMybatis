package com.company.app.emp.service.impl;

import java.util.List;

import com.company.app.emp.service.Dept;

public interface DeptMapper {
	public Dept getDept(String id);
	public List<Dept> getDeptlist();
}
