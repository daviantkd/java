package com.simplestore.service;

import java.util.List;
import com.simplestore.domain.Category;

public interface CategoryService extends Service {
	public List<Category> getAllCategories();

	public Category getCategoryByCategoryId(int categoryId);
}
