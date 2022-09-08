package com.saloon.repository;

import java.util.Optional;

import com.saloon.entity.UserLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Integer>{

	Optional findUserLoginByUemail(String uemail);

}
