package com.zoomcar.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.zoomcar.model.Car;
import com.zoomcar.model.CarDTO;
import com.zoomcar.model.CarType;
import com.zoomcar.service.ICarService;
import com.zoomcar.model.CarMapper;

@RestController
@RequestMapping("/cars")
@CrossOrigin(origins = "*")
public class CarController {
	
	Logger logger = LoggerFactory.getLogger(CarController.class);
	
	@Autowired
	private ICarService carService;
	public CarController(ICarService carService) {
		super();
		this.carService = carService;
	}
	
	@PostMapping("/car")
	ResponseEntity<CarDTO> saveCar(@RequestBody CarDTO carDTO) {
		carService.addCar(carDTO);
		
		return ResponseEntity.ok().body(carDTO);
	}
	
	@GetMapping("/find-all")
	ResponseEntity<List<CarDTO>> findAll() {
		List<CarDTO> carDtos = carService.findAll();
		
		return ResponseEntity.ok().body(carDtos);
	}
	
	@GetMapping("/car/{carId}")
	ResponseEntity<CarDTO> findById(@PathVariable("carId") String carId) {
		CarDTO carDto = carService.findById(carId);
		
		return ResponseEntity.ok().body(carDto);
	}
	
	@GetMapping("/category/{category}")
	ResponseEntity<List<CarDTO>> findByCategory(@PathVariable("category") CarType category) {
		List<CarDTO> carDto = carService.findByCategory(category);
		
		return ResponseEntity.ok().body(carDto);
	}
	
	@GetMapping("/price/{price}")
	ResponseEntity<List<CarDTO>> findByPrice(@PathVariable("price") Integer price) {
		List<CarDTO> carDto = carService.findByPrice(price);
		
		return ResponseEntity.ok().body(carDto);
	}
	
	@GetMapping("/location/{location}")
	ResponseEntity<List<CarDTO>> findByLocation(@PathVariable("location") String location) {
		List<CarDTO> carDto = carService.findByLocation(location);
		
		return ResponseEntity.ok().body(carDto);
	}
	
	@GetMapping("/rating/{rating}")
	ResponseEntity<List<CarDTO>> findByRating(@PathVariable("rating") Integer rating) {
		List<CarDTO> carDto = carService.findByRating(rating);
		
		return ResponseEntity.ok().body(carDto);
	}
}
