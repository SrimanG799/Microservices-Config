package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.DepartMent;
import com.ciq.repository.Departepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@AllArgsConstructor
@Slf4j
public class DepartMentservicImpli implements Departmentservice{
	@Autowired
	private Departepository departepository;

	@Override
	public DepartMent saveDepartment(DepartMent departMent) {
		// TODO Auto-generated method stub
		return departepository.save(departMent);
	}

	@Override
	public DepartMent getDepartMentByid(Long id) {
		// TODO Auto-generated method stub
		return departepository.findById(id).get();
	}

}
