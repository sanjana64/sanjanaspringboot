package io.ordermeals.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private String orderId;
	@ElementCollection
	private List<Meal> mealList= new ArrayList<Meal>();
	private Time orderTime;
	private Time deliveryTime;
	private Date orderDate;
	
	public Order() {
		
	}

	public Order(String orderId, List<Meal> mealList, Time orderTime, Time deliveryTime, Date orderDate) {
		super();
		this.orderId = orderId;
		this.mealList = mealList;
		this.orderTime = orderTime;
		this.deliveryTime = deliveryTime;
		this.orderDate = orderDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<Meal> getMealList() {
		return mealList;
	}

	public void setMealList(List<Meal> mealList) {
		this.mealList = mealList;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
