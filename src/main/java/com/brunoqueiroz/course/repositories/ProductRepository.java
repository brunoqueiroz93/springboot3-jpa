package com.brunoqueiroz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoqueiroz.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
