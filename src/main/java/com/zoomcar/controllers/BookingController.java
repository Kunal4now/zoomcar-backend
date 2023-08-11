package com.zoomcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoomcar.model.BookingDTO;
import com.zoomcar.service.IBookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "*")
public class BookingController {
	
	@Autowired
	private IBookingService iBookingService;
	
	@PostMapping("/add-booking/")
	RequestEntity<Object>  createBooking(@RequestBody BookingDTO bookingDTO) {
		iBookingService.addBooking(bookingDTO);
		
		return (RequestEntity<Object>) ResponseEntity.status(HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/update-booking")
	RequestEntity<Object>  updateBooking(@RequestBody BookingDTO bookingDTO) {
		iBookingService.updateBooking(bookingDTO);
		
		return (RequestEntity<Object>) ResponseEntity.status(HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/user-id/{userId}")
	ResponseEntity<List<BookingDTO>>  findByUserId(@PathVariable("userId") String userId) {
		List<BookingDTO> bookings = iBookingService.findByUserId(userId);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookings);
	}
	
	@PostMapping("/booking-id/{bookingId}")
	ResponseEntity<BookingDTO>  findByBookingId(@PathVariable("bookingId") String bookingId) {
		BookingDTO bookingDto = iBookingService.findByBookingId(bookingId);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookingDto);
	}
}
