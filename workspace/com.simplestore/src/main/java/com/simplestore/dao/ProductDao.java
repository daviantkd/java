package com.simplestore.dao;

import java.util.List;
import com.simplestore.domain.Product;

public interface ProductDao extends Dao {
	public List<Product> getAllProducts();

	public Product getProductByProductId(int productId);
}
