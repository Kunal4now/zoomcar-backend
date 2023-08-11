package com.zoomcar.service;

import java.util.List;

import com.zoomcar.model.BookingDTO;

public interface IBookingService {
	void addBooking(BookingDTO bookingDto);
	void updateBooking(BookingDTO bookingDto);
	
	BookingDTO findByBookingId(String bookingId);
	List<BookingDTO> findByUserId(String userId);
}
