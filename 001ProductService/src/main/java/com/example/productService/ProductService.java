package com.example.productService;

import com.example.model.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;

public interface ProductService {

	long addProduct(ProductRequest productRequest);

	ProductResponse getProductById(long productId);

	void reduceQuantity(long productId, long quantity);

	public void deleteProductById(long productId);

}
