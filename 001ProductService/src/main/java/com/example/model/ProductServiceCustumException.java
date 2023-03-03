package com.example.model;

import lombok.Data;

@Data

public class ProductServiceCustumException extends RuntimeException {
	
	 private String errorCode;

	    public ProductServiceCustumException(String message, String errorCode) {
	        super(message);
	        this.errorCode = errorCode;
	        

}
}
