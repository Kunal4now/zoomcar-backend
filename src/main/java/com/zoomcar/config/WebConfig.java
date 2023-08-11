package com.zoomcar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import com.zoomcar.service.UserServiceImpl;

@Configuration
public class WebConfig {
//	@Bean
//	public UserDetailsManager userDetailsManager() {
////		return new UserServiceImpl();
//		UserDetails user1 = User.withUsername("kunal").password(encoder().encode("kunal123")).roles("USER")
//				.build();
//		
//		System.out.println("user created");
//		
//		System.out.println(user1);
//
//		UserDetails user2 = User.withUsername("Prabal").password(encoder().encode("prabal123")).roles("ADMIN", "USER")
//				.build();
//		return new InMemoryUserDetailsManager(user1, user2);
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//		return http
//				.csrf()
//				.disable()
//				.authorizeHttpRequests(httpRequest -> {
////					httpRequest.requestMatchers("/cars").permitAll().anyRequest().authenticated();
////					httpRequest.requestMatchers(HttpMethod.GET, "/greet-api/v1", "/user-api/v1/app-users").permitAll();
////					httpRequest.requestMatchers("/greet-api/v1/admin/**").hasRole("ADMIN");
////					httpRequest.requestMatchers("/greet-api/v1/user/**").hasRole("USER");
//					httpRequest.requestMatchers("/").permitAll();
//					httpRequest.requestMatchers("/user/**").hasAnyRole("ADMIN", "User");
//					httpRequest.requestMatchers("/admin.**").hasRole("ADMIN");
//					httpRequest.requestMatchers("/cars/**").hasRole("ADMIN");
//				})
//				.httpBasic() // the username and password goes as authorization headers
//				.and()
//				.build();

//	}
	
}
