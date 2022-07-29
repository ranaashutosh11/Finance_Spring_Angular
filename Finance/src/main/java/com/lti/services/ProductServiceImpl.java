package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Product;
import com.lti.dao.ProductDao;


@Service("prdService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    ProductDao prdDao;
	
	@Override
	public List<Product> getPrdList() {
		return prdDao.getPrdList() ;
	}

	@Override
	public List<Product> getPrdByName(String pName) {
		return prdDao.getPrdByName(pName);
	}

}
