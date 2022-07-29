package com.lti.dao;

import java.util.List;

import com.lti.beans.Product;

public interface ProductDao {
    public List<Product> getPrdList();
    public List<Product> getPrdByName(String pName);
    
}
