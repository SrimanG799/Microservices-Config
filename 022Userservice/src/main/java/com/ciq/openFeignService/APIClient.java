package com.ciq.openFeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ciq.entity.DepartmentDto;

@FeignClient(value ="departmentservice" )
public interface APIClient {
	@GetMapping("/getDepartmentId/{id}")
	DepartmentDto getDepart(@PathVariable("id") Long id); 
	

}
