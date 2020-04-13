package io.ordermeals.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ordermeals.model.Meal;
import io.ordermeals.model.Order;
import io.ordermeals.repository.MealsRepository;
import io.ordermeals.repository.OrderRepository;

@Service
public class OrderMealsService {
	
	@Autowired
	private MealsRepository mealsRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	public void addMeal(Meal meal) {
		mealsRepository.save(meal);
		
	}

	public List<Meal> getMeals() {
		List <Meal> meals=new ArrayList<>();
		mealsRepository.findAll().forEach(meals::add);
		return meals;
		
	}

	public int getMealsPerDay(Date date) {
		//Date newDate = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ").parse(date);
		//Date newDate=Date.valueOf(date);
		return mealsRepository.findByMealDate(date).size();
	}

	public void addOrder(Order order) {
		orderRepository.save(order);
	}
	
	public Order getOrderDeliveryTime(String orderId) {
		return orderRepository.findById(orderId).get();
	}

	public Map<String,Integer> getEachMealCount() {
		return mealsRepository.findByMealType();
	}


}
