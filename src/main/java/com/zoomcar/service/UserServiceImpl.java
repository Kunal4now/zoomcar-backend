package com.zoomcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoomcar.model.AppUser;
import com.zoomcar.model.Booking;
import com.zoomcar.model.BookingDTO;
import com.zoomcar.model.BookingMapper;
import com.zoomcar.model.UserDTO;
import com.zoomcar.model.UserMapper;
import com.zoomcar.repository.IBookingRepository;
import com.zoomcar.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository iUserRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private IBookingService iBookingService;
	
	@Autowired
	private BookingMapper bookingMapper;

	public List<UserDTO> findAll() {
		List<AppUser> users = iUserRepository.findAll();
		List<UserDTO> userDto = users.stream().map(user -> userMapper.convertToDTO(user)).toList();	
		
		return userDto;
	}

	public UserDTO findById(String userId) {
		AppUser user = iUserRepository.findById(userId).get();
		
		UserDTO userDto = userMapper.convertToDTO(user);
		
		return userDto;
	}

//	public void addUser(UserDTO userDTO) {
//		AppUser user = userMapper.convertToDocument(userDTO);
//		iUserRepository.insert(user);
//	}
//
//
//	public void updateUser(UserDTO userDTO) {
//		AppUser user = userMapper.convertToDocument(userDTO);
//		iUserRepository.save(user);
//	}
//
//
//	public void deleteUser(UserDTO userDTO) {
//		AppUser user = userMapper.convertToDocument(userDTO);
//		iUserRepository.delete(user);
//	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		AppUser user = iUserRepository.findByName(username);
//		
//		UserDetails userDetails = userMapper.convertToUserDetails(user);
//		
//		return userDetails;
//	}

//	@Override
//	public void createUser(UserDetails userDetails) {
//		AppUser user = userMapper.convertToAppUser(userDetails);
//		iUserRepository.insert(user);
//	}
//
//	@Override
//	public void updateUser(UserDetails userDetails) {
//		AppUser user = userMapper.convertToAppUser(userDetails);
//		iUserRepository.save(user);
//	}
//
//	@Override
//	public void deleteUser(String username) {
//		AppUser appUser = iUserRepository.findByName(username);
//		
////		AppUser user = userMapper.convertToAppUser(appUser);
//		iUserRepository.save(appUser);
//	}
//
//	@Override
//	public void changePassword(String oldPassword, String newPassword) {
//		
//	}
//
//	@Override
//	public boolean userExists(String username) {
//		AppUser user = iUserRepository.findByName(username);
//		
//		if (user == null) {
//			return false;
//		}
//		
//		return true;
//	}

	@Override
	public List<BookingDTO> findBookings(String userId) {
		List<BookingDTO> bookingDtos = iBookingService.findByUserId(userId);
		
		return bookingDtos;
	}

}
