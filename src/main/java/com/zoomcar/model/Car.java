package com.zoomcar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@Document
public class Car {
	@Id
	private String carId;
	private String model;
	private Integer price;
	private Availability availability;
	private Integer capacity;
	private CarType type;
	private Integer rating;
	private String location;
	private String image;
	private MultipartFile imageFile;
	private String brand;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carId, String model, Integer price, Availability availability, Integer capacity, CarType type,
			Integer rating, String location, String image, MultipartFile imageFile, String brand) {
		super();
		this.carId = carId;
		this.model = model;
		this.price = price;
		this.availability = availability;
		this.capacity = capacity;
		this.type = type;
		this.rating = rating;
		this.location = location;
		this.image = image;
		this.imageFile = imageFile;
		this.brand = brand;
	}
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", price=" + price + ", availability=" + availability
				+ ", capacity=" + capacity + ", type=" + type + ", rating=" + rating + ", location=" + location
				+ ", image=" + image + ", imageFile=" + imageFile + ", brand=" + brand + "]";
	}
}
