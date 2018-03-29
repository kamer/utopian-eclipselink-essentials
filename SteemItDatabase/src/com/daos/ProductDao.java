package com.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entities.PRODUCT;

public class ProductDao implements ICrud<PRODUCT> {

	EntityManagerFactory emf = null;
	EntityManager em = null;

	public ProductDao() {
		emf = Persistence.createEntityManagerFactory("SteemItDatabase");
		em = emf.createEntityManager();
	}

	@Override
	public Boolean create(PRODUCT entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PRODUCT read(Long id) {
		try {
			PRODUCT product = em.find(PRODUCT.class, id);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Boolean update(PRODUCT entity) {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean delete(Long id) {

		try {
			PRODUCT product = read(id);
			em.getTransaction().begin();
			em.remove(product);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
