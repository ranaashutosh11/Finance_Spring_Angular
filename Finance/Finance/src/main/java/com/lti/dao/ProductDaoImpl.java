package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
    
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Product> getPrdList() {
		Query qry=em.createQuery("select p from Product p");
		List<Product> prdList=qry.getResultList();
		return prdList;
	}


	@Override
	public List<Product> getPrdByName(String pName) {
		Query qry=em.createQuery("select p from Product p where p.prdName=:pName");
		qry.setParameter("pName", pName);
		List<Product> prdListByName=qry.getResultList();
		return prdListByName;
	}
	

}