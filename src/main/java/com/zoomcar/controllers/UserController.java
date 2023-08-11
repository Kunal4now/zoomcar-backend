package com.zoomcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoomcar.model.UserDTO;
import com.zoomcar.model.UserMapper;
import com.zoomcar.service.IUserService;

//@RestController
//@RequestMapping("/user")
public class UserController {
//	
//	private UserDetailsManager userDetailsManager;
//
//	public UserController(UserDetailsManager userDetailsManager) {
//		super();
//		this.userDetailsManager = userDetailsManager;
//	}
//	
//	@Autowired
//	private UserMapper userMapper;
//	
//	@GetMapping("/find-all")
//	ResponseEntity<List<UserDTO>> findAll(String userId) {
//		List<UserDTO> userDtos = userDetailsManager.findAll();
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.add("desc", "Getting data from find-all");
//		return ResponseEntity.ok().headers(httpHeaders).body(userDtos);
//	}
//	
//	@GetMapping("/register")
//	ResponseEntity<Object> addUser(@PathVariable("userDto") UserDTO userDto) {
//		iUserService.addUser(userDto);
//		
//		return ResponseEntity.status(200).build();
//	}
//	
//	@GetMapping("/update")
//	ResponseEntity<Object> updateUser(@PathVariable("userDto") UserDTO userDto) {
//		iUserService.updateUser(userDto);
//		
//		return ResponseEntity.status(200).build();
//	}
//	
//	@GetMapping("/delete")
//	ResponseEntity<Object> deleteUser(@PathVariable("userDto") UserDTO userDto) {
//		iUserService.deleteUser(userDto);
//		
//		return ResponseEntity.status(200).build();
//	}
}
