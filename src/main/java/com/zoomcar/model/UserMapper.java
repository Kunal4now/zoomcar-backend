package com.zoomcar.model;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {
	public AppUser convertToDocument(UserDTO userDTO) {
		AppUser AppUser = new AppUser();
		AppUser.setName(userDTO.getName());
		AppUser.setPassword(userDTO.getPassword());
		AppUser.setBalance(userDTO.getBalance());
		AppUser.setRoles(userDTO.getRoles());
		AppUser.setUserId(userDTO.getUserId());
		return AppUser;
	}

	public UserDTO convertToDTO(AppUser AppUser) {
		UserDTO userDTO = new UserDTO();
		userDTO.setName(AppUser.getName());
		userDTO.setPassword(AppUser.getPassword());
		userDTO.setBalance(AppUser.getBalance());
		userDTO.setRoles(AppUser.getRoles());
		userDTO.setUserId(AppUser.getUserId());
		return userDTO;
	}

//	public AppUser convertToAppUser(UserDetails userDetails) {
//		// get data from UserDetails
////		String username = user.getUsername();
////		String password = user.getPassword();
////		List<String> roles = user.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.getAuthority())
////				.toList();
////		// create appUser object
////		User user = new AppUser();
////		user.(username);
////		user.setPassword(password);
////		user.setRoles(roles);
////		return user;
//		String name = userDetails.getUsername();
//		String password = userDetails.getPassword();
//		List<String> roles = userDetails.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.getAuthority()).toList();
//		
//		AppUser user = new AppUser();
//		
//		return user;
//	}
//
//	public UserDetails convertToUserDetails(AppUser user) {
//		String username = user.getName();
//
//		String password = user.getPassword();
//
//		List<GrantedAuthority> roles = user.getRoles()
//
//				.stream()
//
//				.map(role -> new SimpleGrantedAuthority(role))
//
//				.collect(Collectors.toList());
//
//		return new User(username, password, roles);
//
//	}
}
