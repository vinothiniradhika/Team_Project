package com.saloon.repository;

import java.util.Optional;

import com.saloon.entity.Booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

	Optional findBookingByShopname(String shopname);

}
