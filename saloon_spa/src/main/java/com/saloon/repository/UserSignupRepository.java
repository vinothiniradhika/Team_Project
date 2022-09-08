package com.saloon.repository;

import com.saloon.entity.UserSignup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignupRepository extends JpaRepository<UserSignup, Integer>{

}
