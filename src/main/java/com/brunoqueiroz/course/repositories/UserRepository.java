package com.brunoqueiroz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoqueiroz.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
