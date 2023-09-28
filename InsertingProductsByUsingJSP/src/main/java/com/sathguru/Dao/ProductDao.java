package com.sathguru.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.sathguru.Dto.ProductDto;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oracleTest");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Transactional
	public ProductDto saveProduct(ProductDto productDto) {
		entityTransaction.begin();
		entityManager.persist(productDto);

		entityTransaction.commit();
		return productDto;
	}

	public List<ProductDto> fetchAll() {

		Query query = entityManager.createQuery("select * from ProductDto p");
		entityManager.find(ProductDto.class, query);
		query.getResultList();

		return null;

	}

}
