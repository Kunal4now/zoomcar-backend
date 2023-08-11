package com.zoomcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zoomcar.model.AppUser;
import com.zoomcar.model.BookingDTO;
import com.zoomcar.model.UserDTO;

public interface IUserService {
	List<UserDTO> findAll();

	UserDTO findById(String userId);
	
	List<BookingDTO> findBookings(String userId);
	
	
}
