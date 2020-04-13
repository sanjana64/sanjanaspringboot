package io.ordermeals.repository;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.ordermeals.model.Meal;

public interface MealsRepository extends CrudRepository<Meal,String>{
	
	public List<Meal> findByMealDate(Date date);
	
	@Query("select m.mealType, count(m.mealType) from Meal m group by m.mealType")
	public Map<String,Integer> findByMealType();

}
