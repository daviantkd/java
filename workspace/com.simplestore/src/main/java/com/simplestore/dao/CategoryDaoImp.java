package com.simplestore.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.simplestore.domain.Category;

public class CategoryDaoImp implements CategoryDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Object o) {
		this.sessionFactory.getCurrentSession().save(o);
	}

	@Override
	public void update(Object o) {
		this.sessionFactory.getCurrentSession().update(o);
	}

	@Override
	public void delete(Object o) {
		this.sessionFactory.getCurrentSession().delete(o);
	}

	@Override
	public List<Category> getAllCategories() {
		// return
		// this.sessionFactory.getCurrentSession().createQuery("from Category").list();

		return this.sessionFactory.getCurrentSession()
				.createCriteria(Category.class).list();
	}

	@Override
	public Category getCategoryByCategoryId(int categoryId) {
		// return (Category) this.sessionFactory.getCurrentSession()
		// .createQuery("from Category where categoryId = :categoryId")
		// .setParameter("categoryId", categoryId).list().get(0);

		return (Category) this.sessionFactory.getCurrentSession().get(
				Category.class, categoryId);
	}

}
