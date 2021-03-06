package com.cts.training.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.userservice.entity.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	

}
