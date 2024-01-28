package com.fateczl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.course.entities.Category;

@Repository // Opcional.
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
