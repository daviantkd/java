package com.simplestore.domain;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private int categoryId;
	private String categoryName;
	private boolean flag;
	private Set<Product> products = new HashSet<Product>(0);

	public Category() {
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
