package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRICE")
	private long price;

	@Column(name = "QUANTITY")
	private long quantity;

}
