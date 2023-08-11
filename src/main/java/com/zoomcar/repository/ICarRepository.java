package com.zoomcar.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zoomcar.model.Availability;
import com.zoomcar.model.Car;
import com.zoomcar.model.CarDTO;
import com.zoomcar.model.CarType;

@Repository
public interface ICarRepository extends MongoRepository<Car, String> {
	
	@Query("{category: ?0}")
	List<Car> findByCategory(CarType carType);
	
	@Query("{availability: ?0}")
	List<Car> findByAvailability(Availability availability);
		
	@Query("{price: ?0}")
	List<Car> findByPrice(Integer price);
	
	@Query("{location: ?0}")
	List<Car> findByLocation(String location);
	
	@Query("{rating: ?0}")
	List<Car> findByRating(Integer rating);
}
