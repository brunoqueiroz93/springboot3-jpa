package com.brunoqueiroz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoqueiroz.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
