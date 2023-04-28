package com.ciq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private Long id;
	private String firstname;
	private String lastname;
	
	@Column(nullable = false,unique = true)
	private String email;
	private Long departmentid;

}
