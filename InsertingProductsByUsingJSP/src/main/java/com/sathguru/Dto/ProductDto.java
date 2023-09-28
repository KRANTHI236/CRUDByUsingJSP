package com.sathguru.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product_master")

public class ProductDto {

	@Id
	private int productno;
	private int code;
	private String description;
	private float price;
	private long crtd_dt;
	private String crtd_by;

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getCrtd_dt() {
		return crtd_dt;
	}

	public void setCrtd_dt(long crtd_dt) {
		this.crtd_dt = crtd_dt;
	}

	public String getCrtd_by() {
		return crtd_by;
	}

	public void setCrtd_by(String crtd_by) {
		this.crtd_by = crtd_by;
	}

}
