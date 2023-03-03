package com.example.productController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.example.productService.ProductService;
import com.example.productService.ProductServiceImpli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequiredArgsConstructor
@Slf4j
@AllArgsConstructor
@Data
public class ProductController {
	
	@Autowired
private	ProductService productService;


@PostMapping("/addProduct")

public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest) {

    log.info("ProductController | addProduct is called");

    log.info("ProductController | addProduct | productRequest : " + productRequest.toString());

    long productId = productService.addProduct(productRequest);
    return new ResponseEntity<>(productId, HttpStatus.CREATED);
}


@GetMapping("get/{id}")
public ProductResponse Getp(@PathVariable("id") long productId) {

	log.info("object***{}",productService);
ProductResponse p=productService.getProductById(productId);

     
    return p;
}
}
