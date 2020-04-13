package io.ordermeals.repository;

import org.springframework.data.repository.CrudRepository;

import io.ordermeals.model.Order;

public interface OrderRepository extends CrudRepository<Order,String> {

}
