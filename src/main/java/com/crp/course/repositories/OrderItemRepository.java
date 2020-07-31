package com.crp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
