package com.saloon.controller;

import java.util.List;

import com.saloon.entity.Booking;
import com.saloon.service.BookingService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController{
	private  BookingService bookservice;
	
	public BookingController(BookingService bookservice) {
		super();
		this.bookservice = bookservice;
	}
	
	
	@GetMapping("/allbookings")
	public ResponseEntity<List<Booking>> getAllBookings(){
		List<Booking> bookings=bookservice.findAllBookings();
		return new ResponseEntity<>(bookings,HttpStatus.OK);
		
	}
	
	@GetMapping("/booking/{shopname}")
	public ResponseEntity<Booking> getBookingByShopname(@PathVariable("shopname") String shopname) throws Throwable {
		Booking booking=bookservice.findBookingByShopname(shopname);
		return new ResponseEntity<>(booking,HttpStatus.OK);
		
	}
	
	@PostMapping("/addbooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
		Booking newBooking=bookservice.addBooking(booking);
		return new ResponseEntity<>(newBooking,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updatebooking")
	public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking){
		Booking newBooking=bookservice.updateBooking(booking);
		return new ResponseEntity<>(newBooking,HttpStatus.OK);
		
	}

	
	
	
	
}