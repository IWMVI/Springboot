package com.fateczl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.course.entities.User;

@Repository // Opcional.
public interface UserRepository extends JpaRepository<User, Long> {

}
