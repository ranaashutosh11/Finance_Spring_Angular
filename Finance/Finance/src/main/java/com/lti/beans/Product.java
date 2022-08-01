package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	//insert into products values (2000,'Tractor','TATA Tractor',10000.00);	
	@Id
	@Column(name="PRDID")
	int prdId;
	
	@Column(name="PRDNAME")
	String prdName;
	
	@Column(name="PRDPRICE")
	double prdPrice;
	
	@Column(name="PRDDESC")
	String prdDesc;
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}
	public String getPrdDesc() {
		return prdDesc;
	}
	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}
	public Product() {
		super();
	}
	public Product(int prdId, String prdName, double prdPrice, String prdDesc) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdDesc = prdDesc;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + ", prdDesc=" + prdDesc
				+ "]";
	}
    
	
	
}