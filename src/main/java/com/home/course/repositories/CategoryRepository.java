package com.home.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
