package com.summerSchool.firstProject.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity(name="order_details")
@Table(name="ORDER_DETAILS")
public class OrderDetailsEntity {
	
	@EmbeddedId
	private OrderDetailsId orderDetailsId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("orderId")
	@JoinColumn(name="orderId")
	private  OrderEntity orderEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("productId")
	@JoinColumn(name="productId")
	private  ProductEntity productEntity;

}
