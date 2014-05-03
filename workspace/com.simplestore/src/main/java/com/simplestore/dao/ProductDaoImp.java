package com.simplestore.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.simplestore.domain.Product;

public class ProductDaoImp implements ProductDao {
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
	public List<Product> getAllProducts() {
		// return this.sessionFactory.getCurrentSession()
		// .createQuery("from Product").list();

		return this.sessionFactory.getCurrentSession()
				.createCriteria(Product.class).list();
	}

	@Override
	public Product getProductByProductId(int productId) {
		// return (Product) this.sessionFactory.getCurrentSession()
		// .createQuery("from Product where productId = :productId")
		// .setParameter("productId", productId).list().get(0);

		return (Product) this.sessionFactory.getCurrentSession().get(
				Product.class, productId);
	}

}
