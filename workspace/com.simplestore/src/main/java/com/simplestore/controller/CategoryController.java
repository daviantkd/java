package com.simplestore.controller;

import com.simplestore.service.CategoryService;

public class CategoryController {
	private CategoryService categoryService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
}
