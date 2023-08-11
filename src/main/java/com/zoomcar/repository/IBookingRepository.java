package com.zoomcar.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zoomcar.model.Booking;
import com.zoomcar.model.BookingDTO;

@Repository
public interface IBookingRepository extends MongoRepository<Booking, String> {
	
	@Query("{bookingId: ?0}")
	Booking findByBookingId(String bookingId);
	
	@Query("{userId: ?0}")
	List<Booking> findByUserId(String userId);
}
