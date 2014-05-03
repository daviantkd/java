package com.simplestore.service;

import java.util.List;
import com.simplestore.domain.Product;

public interface ProductService extends Service {
	public List<Product> getAllProducts();

	public Product getProductByProductId(int productId);
}
