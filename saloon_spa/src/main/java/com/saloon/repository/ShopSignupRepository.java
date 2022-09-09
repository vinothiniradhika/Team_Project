package com.saloon.repository;

import com.saloon.entity.ShopSignup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopSignupRepository extends JpaRepository<ShopSignup, Integer>{

}
