package com.fateczl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.course.entities.Product;

@Repository // Opcional.
public interface ProductRepository extends JpaRepository<Product, Long> {

}
