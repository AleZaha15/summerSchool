package com.summerSchool.firstProject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Order")
@Table(name="ORDER")
public class OrderEntity {
	
	@Id
	private int orderId;
	
	@Column(name="ORDER_CODE")
	private String orderCode;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "orderEntity")
	private List<OrderDetailsEntity> orderDetailsList;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

}
