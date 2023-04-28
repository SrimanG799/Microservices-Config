package com.ciq.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userpr")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	@Id
	
	private String uname;
	
	private String password;
	

}
