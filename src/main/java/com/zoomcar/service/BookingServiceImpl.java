package com.zoomcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zoomcar.model.Booking;
import com.zoomcar.model.BookingDTO;
import com.zoomcar.model.BookingMapper;
import com.zoomcar.repository.IBookingRepository;

@Service
public class BookingServiceImpl implements IBookingService {
	
	@Autowired
	private IBookingRepository iBookingRepository;
	
	@Autowired
	private BookingMapper bookingMapper;

	@Override
	public BookingDTO findByBookingId(String bookingId) {
		Booking booking = iBookingRepository.findByBookingId(bookingId);
		
		BookingDTO bookingDto = bookingMapper.convertToDTO(booking);
		
		return bookingDto;
	}

	@Override
	public List<BookingDTO> findByUserId(String userId) {
		List<Booking> bookings = iBookingRepository.findByUserId(userId);
		
		List<BookingDTO> bookingDtos = bookings.stream().map(booking -> bookingMapper.convertToDTO(booking)).toList();
		
		return bookingDtos;
	}

	@Override
	public void addBooking(BookingDTO bookingDto) {
		Booking booking = bookingMapper.convertToDocument(bookingDto);
		
		iBookingRepository.insert(booking);
	}

	@Override
	public void updateBooking(BookingDTO bookingDto) {
		Booking booking = bookingMapper.convertToDocument(bookingDto);
		
		iBookingRepository.save(booking);
	}
}
