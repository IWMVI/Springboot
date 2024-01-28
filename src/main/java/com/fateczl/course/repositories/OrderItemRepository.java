package com.fateczl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.course.entities.OrderItem;

@Repository // Opcional.
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
