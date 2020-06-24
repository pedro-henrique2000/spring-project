package com.home.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
