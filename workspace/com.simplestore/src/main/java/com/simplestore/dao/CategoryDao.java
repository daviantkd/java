package com.simplestore.dao;

import java.util.List;
import com.simplestore.domain.Category;

public interface CategoryDao extends Dao {
	public List<Category> getAllCategories();

	public Category getCategoryByCategoryId(int categoryId);
}
