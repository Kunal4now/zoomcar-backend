package com.zoomcar.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
	@Id
	private String bookingId;
	private String userId;
	private String carId;
	private LocalDate bookingFrom;
	private LocalDate bookingTo;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	public Booking(String userId, String carId, LocalDate bookingFrom, LocalDate bookingTo, String bookingId) {
		super();
		this.userId = userId;
		this.carId = carId;
		this.bookingFrom = bookingFrom;
		this.bookingTo = bookingTo;
		this.bookingId = bookingId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public LocalDate getBookingFrom() {
		return bookingFrom;
	}
	public void setBookingFrom(LocalDate bookingFrom) {
		this.bookingFrom = bookingFrom;
	}
	public LocalDate getBookingTo() {
		return bookingTo;
	}
	public void setBookingTo(LocalDate bookingTo) {
		this.bookingTo = bookingTo;
	}
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", carId=" + carId + ", bookingFrom="
				+ bookingFrom + ", bookingTo=" + bookingTo + "]";
	}
	
	
}
