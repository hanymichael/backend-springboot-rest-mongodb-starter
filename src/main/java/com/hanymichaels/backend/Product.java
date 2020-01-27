package com.hanymichaels.backend;

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
	
	// The Constructor
	public Product(String productName, String productType, String productURI, String productUserName,
			String productPassword) {
		this.productName = productName;
		this.productType = productType;
		this.productURI = productURI;
		this.productUserName = productUserName;
		this.productPassword = productPassword;
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
	
	

}
