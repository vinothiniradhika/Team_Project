package com.saloon.service;


import java.util.List;
import java.util.UUID;

import com.saloon.entity.Booking;
import com.saloon.exception.BookingNotFoundException;
import com.saloon.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
	private BookingRepository bookingrepo;
	
	@Autowired
	public BookingService(BookingRepository repo) {
		this.bookingrepo=bookingrepo;
	}
	
	public Booking addBooking(Booking book) {
		book.setBookingCode(UUID.randomUUID().toString());
		return bookingrepo.save(book);
		
	}
	public List<Booking> findAllBookings(){ 
		return bookingrepo.findAll();
	}
	public Booking updateBooking(Booking book) { 
		return bookingrepo.save(book);
	}
	public Booking findBookingByShopname(String shopname) { 
		return (Booking) bookingrepo.findBookingByShopname(shopname).orElseThrow(()-> new BookingNotFoundException("No customer booked for "+ shopname));
	}
	

}
