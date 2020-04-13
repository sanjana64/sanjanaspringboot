package io.ordermeals.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.ordermeals.model.Meal;
import io.ordermeals.model.Order;
import io.ordermeals.service.OrderMealsService;

@RestController
public class OrderMealsController {
	
	@Autowired
	private OrderMealsService orderMealsService;

	@RequestMapping(method=RequestMethod.POST, value="/meals")
	public void addMeal(@RequestBody Meal meal) {
		orderMealsService.addMeal(meal);
	}
	
	@RequestMapping("/meals")
	public List<Meal> getMeals() {
		return orderMealsService.getMeals();
	}
	
	@RequestMapping("/meals/{date}")
	public int getMealsPerDay(@PathVariable("date") Date date){
		return orderMealsService.getMealsPerDay(date);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders")
	public void addOrder(@RequestBody Order order) {
		orderMealsService.addOrder(order);
	}
	
	@RequestMapping("/orders/{orderId}")
	public Order getOrderDeliveryTime(@PathVariable("orderId") String orderId){
		return orderMealsService.getOrderDeliveryTime(orderId);
	}
	
	@RequestMapping("/meals/mealType")
	public Map<String,Integer> getEachMealCount(){
		return orderMealsService.getEachMealCount();
	}
}
