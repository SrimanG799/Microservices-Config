package com.ciq.entity;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private Long id;
	private String firstname;
	private String lastname;
	private Long departmentid;
	private String email;

}
