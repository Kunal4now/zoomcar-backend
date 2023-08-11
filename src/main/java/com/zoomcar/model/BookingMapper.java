package com.zoomcar.model;

import org.springframework.stereotype.Component;

@Component
public class BookingMapper {
	public Booking convertToDocument(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setBookingId(bookingDTO.getBookingId());
		booking.setUserId(bookingDTO.getUserId());
		booking.setCarId(bookingDTO.getCarId());
		booking.setBookingFrom(bookingDTO.getBookingFrom());
		booking.setBookingTo(bookingDTO.getBookingTo());
		
		return booking;
	}
	
	public BookingDTO convertToDTO(Booking booking) {
		BookingDTO bookingDTO = new BookingDTO();
		bookingDTO.setBookingId(booking.getBookingId());
		bookingDTO.setUserId(booking.getUserId());
		bookingDTO.setCarId(booking.getCarId());
		bookingDTO.setBookingFrom(booking.getBookingFrom());
		bookingDTO.setBookingTo(booking.getBookingTo());
		
		return bookingDTO;
	}
}
