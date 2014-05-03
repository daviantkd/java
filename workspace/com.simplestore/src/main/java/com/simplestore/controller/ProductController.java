package com.simplestore.controller;

import com.simplestore.service.CategoryService;
import com.simplestore.service.ProductService;

public class ProductController {
	private CategoryService categoryService;
	private ProductService productService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
