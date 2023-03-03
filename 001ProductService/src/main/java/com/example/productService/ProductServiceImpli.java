package com.example.productService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.example.productRepository.ProductRepository;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Builder

@Slf4j
public class ProductServiceImpli implements ProductService{
	
	private  ProductRepository ProductRepository;

	@Override
	public long addProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		
		log.info("ProductServiceImpli|Product is called");
		
		
		Product product=Product.builder()
				
				.productName(productRequest.getName())
				
				.quantity(productRequest.getQuantity())
				
				.price(productRequest.getPrice())
				
				.build();
		
		product =ProductRepository.save(product);
		log.info("ProductServiceImpli|addproduct|ProductCreated");
		log.info("ProductServiceImpli|addproduct|"+product.getProductId());
		System.out.println(product);
		return product.getProductId();
		
		
	}

	@Override
	public ProductResponse getProductById(long productId) {
		
		   log.info("ProductServiceImpl | getProductById is called");
	        log.info("ProductServiceImpl | getProductById | Get the product for productId: {}", productId);

	        Product product
	                = ProductRepository.findById(productId).get();
	        
	        log.info("product****{}",product);
//	                .orElseThrow(
//	                        () -> new ProductServiceCustumException("Product with given Id not found","PRODUCT_NOT_FOUND"));
//
        ProductResponse productResponse
                = new ProductResponse();

        copyProperties(product, productResponse);

	     //   log.info("ProductServiceImpl | getProductById | productResponse :" + productResponse.toString());

		// TODO Auto-generated method stub
		return productResponse;
	}


	private void copyProperties(Product product, ProductResponse productResponse) {
		// TODO Auto-generated method stub
		productResponse.setProductName(product.getProductName());
		productResponse.setPrice(product.getPrice());
		productResponse.setProductId(product.getProductId());
		productResponse.setQuantity(product.getQuantity());
		
	}

	@Override
	public void reduceQuantity(long productId, long quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductById(long productId) {
		// TODO Auto-generated method stub
		
	}

	
}

