package com.ls.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ls_order")
public class Order implements Serializable {

	@Id
	@GeneratedValue
	protected Integer id;
	protected String orderNumber;
	protected String supplierNumber;
	protected String orderDate;
	protected String estimateTakeOverDate;
	protected String storeNumber; //also equals address
	protected boolean savedToERP;
	protected Date createDate;
	protected String grabTips;
	
	public String getGrabTips() {
		return grabTips;
	}

	public void setGrabTips(String grabTips) {
		this.grabTips = grabTips;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isSavedToERP() {
		return savedToERP;
	}

	public void setSavedToERP(boolean savedToERP) {
		this.savedToERP = savedToERP;
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getOrderNumber() {

		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {

		this.orderNumber = orderNumber;
	}

	public String getSupplierNumber() {

		return supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {

		this.supplierNumber = supplierNumber;
	}

	public String getOrderDate() {

		return orderDate;
	}

	public void setOrderDate(String orderDate) {

		this.orderDate = orderDate;
	}

	public String getEstimateTakeOverDate() {

		return estimateTakeOverDate;
	}

	public void setEstimateTakeOverDate(String estimateTakeOverDate) {

		this.estimateTakeOverDate = estimateTakeOverDate;
	}

	public String getStoreNumber() {

		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {

		this.storeNumber = storeNumber;
	}

}