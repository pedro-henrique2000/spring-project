package com.home.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
