package com.saloon.repository;

import java.util.Optional;

import com.saloon.entity.ShopLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopLoginRepository extends JpaRepository<ShopLogin, Integer>{

	Optional findShopLoginBySemail(String semail);

}
