package com.saloon.repository;

import com.saloon.entity.ShopSignup;
import com.saloon.entity.UserSignup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopSignupRepository extends JpaRepository<ShopSignup, Long>{

	//ShopSignup findByshopUsernameAndPassword(String sremial, String srpassword);

	//ShopSignup findbysremailandsrpassword(String sremail, String srpassword);

	ShopSignup findBySremailAndSrpassword(String sremail, String srpassword);


}
