package io.ordermeals.model;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Meal {
	
	@Id
	private String mealID;
	private String mealType;
	private int mealQuantity;
	private double mealCost;
	private Date mealDate;
	
	public Meal() {
		
	}

	public Meal(String mealID, String mealType, int mealQuantity, double mealCost, Date mealDate) {
		super();
		this.mealID = mealID;
		this.mealType = mealType;
		this.mealQuantity = mealQuantity;
		this.mealCost = mealCost;
		this.mealDate = mealDate;
	}

	public String getMealID() {
		return mealID;
	}

	public void setMealID(String mealID) {
		this.mealID = mealID;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public int getMealQuantity() {
		return mealQuantity;
	}

	public void setMealQuantity(int mealQuantity) {
		this.mealQuantity = mealQuantity;
	}

	public double getMealCost() {
		return mealCost;
	}

	public void setMealCost(double mealCost) {
		this.mealCost = mealCost;
	}

	public Date getMealDate() {
		return mealDate;
	}

	public void setMealDate(Date mealDate) {
		this.mealDate = mealDate;
	}
		
}
