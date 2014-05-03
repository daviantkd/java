package com.simplestore.service;

import java.util.List;

import com.simplestore.domain.Category;
import com.simplestore.dao.CategoryDao;

public class CategoryServiceImp implements CategoryService {
	private CategoryDao categoryDao;

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public void save(Object o) {
		this.categoryDao.save(o);
	}

	@Override
	public void update(Object o) {
		this.categoryDao.update(o);
	}

	@Override
	public void delete(Object o) {
		this.categoryDao.delete(o);
	}

	@Override
	public List<Category> getAllCategories() {
		return this.categoryDao.getAllCategories();
	}

	@Override
	public Category getCategoryByCategoryId(int categoryId) {
		return this.categoryDao.getCategoryByCategoryId(categoryId);
	}

}
