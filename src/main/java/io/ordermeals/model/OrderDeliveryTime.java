package io.ordermeals.model;

import java.sql.Time;

public class OrderDeliveryTime {
	
	private Time orderTime;
	private Time deliveryTime;
	
	public OrderDeliveryTime() {
		
	}
	
	public OrderDeliveryTime(Time orderTime, Time deliveryTime) {
		super();
		this.orderTime = orderTime;
		this.deliveryTime = deliveryTime;
	}
	
	public Time getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}
	public Time getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Time deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

}
