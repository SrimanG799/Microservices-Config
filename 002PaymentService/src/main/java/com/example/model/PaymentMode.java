package com.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor


public class PaymentMode {
	
	 private String online="online";
	 private String offline="offline";

}
