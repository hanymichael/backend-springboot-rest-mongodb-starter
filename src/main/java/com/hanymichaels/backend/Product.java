package com.hanymichaels.backend;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Products")
public class Product {
	
	@Id
	private String id;
	private String productName;
	private String productType;
	private String productURI;
	private String productUserName;
	private String productPassword;
	private Boolean isActive;
	private Date createdAt;
	
	// The Constructor
	public Product(String productName, String productType, String productURI, String productUserName,
			String productPassword, Boolean isActive, Date createdAt) {
		this.productName = productName;
		this.productType = productType;
		this.productURI = productURI;
		this.productUserName = productUserName;
		this.productPassword = productPassword;
		this.isActive = isActive;
		this.createdAt = createdAt;
		
	}
	

	// The Getters and Setters 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductURI() {
		return productURI;
	}

	public void setProductURI(String productURI) {
		this.productURI = productURI;
	}

	public String getProductUserName() {
		return productUserName;
	}

	public void setProductUserName(String productUserName) {
		this.productUserName = productUserName;
	}

	public String getProductPassword() {
		return productPassword;
	}

	public void setProductPassword(String productPassword) {
		this.productPassword = productPassword;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	
	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	

}
