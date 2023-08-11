package com.zoomcar.model;

import org.springframework.stereotype.Component;

@Component
public class CarMapper {
	public Car convertToDocument(CarDTO carDTO) {
		Car car = new Car();
		car.setCarId(carDTO.getCarId());
		car.setModel(carDTO.getModel());
		car.setCapacity(carDTO.getCapacity());
		car.setPrice(carDTO.getPrice());
		car.setAvailability(carDTO.getAvailability());
		car.setType(carDTO.getType());
		car.setRating(carDTO.getRating());
		car.setLocation(carDTO.getLocation());
		car.setImage(carDTO.getImage());
		car.setImageFile(carDTO.getImageFile());
		car.setBrand(carDTO.getBrand());
		return car;
	}
	
	public CarDTO convertToDTO(Car car) {
		CarDTO carDTO = new CarDTO();
		
		carDTO.setCarId(car.getCarId());
		carDTO.setModel(car.getModel());
		carDTO.setCapacity(car.getCapacity());
		carDTO.setPrice(car.getPrice());
		carDTO.setAvailability(car.getAvailability());
		carDTO.setType(car.getType());
		carDTO.setRating(car.getRating());
		carDTO.setLocation(car.getLocation());
		carDTO.setImage(car.getImage());
		carDTO.setImageFile(car.getImageFile());
		carDTO.setBrand(car.getBrand());
		return carDTO;
	}
}
