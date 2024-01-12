package com.brunoqueiroz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoqueiroz.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
