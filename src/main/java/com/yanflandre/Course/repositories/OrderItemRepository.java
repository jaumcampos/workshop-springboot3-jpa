package com.yanflandre.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanflandre.Course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
