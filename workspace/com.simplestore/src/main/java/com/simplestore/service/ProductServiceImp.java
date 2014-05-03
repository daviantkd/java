package com.simplestore.service;

import java.util.List;

import com.simplestore.domain.Product;
import com.simplestore.dao.ProductDao;

public class ProductServiceImp implements ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void save(Object o) {
		this.productDao.save(o);
	}

	@Override
	public void update(Object o) {
		this.productDao.update(o);
	}

	@Override
	public void delete(Object o) {
		this.productDao.delete(o);
	}

	@Override
	public List<Product> getAllProducts() {
		return this.productDao.getAllProducts();
	}

	@Override
	public Product getProductByProductId(int productId) {
		return this.productDao.getProductByProductId(productId);
	}

}
