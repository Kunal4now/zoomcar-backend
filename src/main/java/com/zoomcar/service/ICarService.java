package com.zoomcar.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zoomcar.model.Availability;
import com.zoomcar.model.Car;
import com.zoomcar.model.CarDTO;
import com.zoomcar.model.CarType;

public interface ICarService {
	void addCar(CarDTO carDTO);
	void updateCar(CarDTO carDTO);
	void deleteCar(CarDTO carDTO);
	CarDTO findById(String carId);
	List<CarDTO> findAll();
	List<CarDTO> findByCategory(CarType carType);
	List<CarDTO> findByAvailability(Availability availability);
	List<CarDTO> findByPrice(Integer price);
	List<CarDTO> findByLocation(String location);
	List<CarDTO> findByRating(Integer rating);
}
