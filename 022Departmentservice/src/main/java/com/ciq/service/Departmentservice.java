package com.ciq.service;

import com.ciq.entity.DepartMent;

public interface Departmentservice {
	
	DepartMent saveDepartment(DepartMent departMent);
	
	DepartMent getDepartMentByid(Long id);

}
