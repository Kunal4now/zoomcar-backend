package com.zoomcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoomcar.model.Availability;
import com.zoomcar.model.Car;
import com.zoomcar.model.CarDTO;
import com.zoomcar.model.CarMapper;
import com.zoomcar.model.CarType;
import com.zoomcar.repository.ICarRepository;

@Service
public class CarServiceImpl implements ICarService {
	
	@Autowired
	private ICarRepository iCarRepository;
	
	@Autowired
	private CarMapper carMapper;

	@Override
	public void addCar(CarDTO carDTO) {
		Car car = carMapper.convertToDocument(carDTO);
		iCarRepository.insert(car);
	}

	@Override
	public void updateCar(CarDTO carDTO) {
		Car car = carMapper.convertToDocument(carDTO);
		iCarRepository.save(car);
	}

	@Override
	public void deleteCar(CarDTO carDTO) {
		Car car = carMapper.convertToDocument(carDTO);
		iCarRepository.delete(car);
	}

	@Override
	public CarDTO findById(String carId) {
		Car car = iCarRepository.findById(carId).get();
		
		return carMapper.convertToDTO(car);
	}

	@Override
	public List<CarDTO> findAll() {
		List<Car> cars = iCarRepository.findAll();
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}

	@Override
	public List<CarDTO> findByCategory(CarType carType) {
		List<Car> cars = iCarRepository.findByCategory(carType);
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}

	@Override
	public List<CarDTO> findByAvailability(Availability availability) {
		List<Car> cars = iCarRepository.findByAvailability(availability);
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}

	@Override
	public List<CarDTO> findByPrice(Integer price) {
		List<Car> cars = iCarRepository.findByPrice(price);
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}

	@Override
	public List<CarDTO> findByLocation(String location) {
		List<Car> cars = iCarRepository.findByLocation(location);
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}

	@Override
	public List<CarDTO> findByRating(Integer rating) {
		List<Car> cars = iCarRepository.findByRating(rating);
		
		List<CarDTO> carDtos = cars.stream().map(car -> carMapper.convertToDTO(car)).toList();
		return carDtos;
	}
}
