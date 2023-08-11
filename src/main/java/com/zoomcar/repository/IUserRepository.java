package com.zoomcar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zoomcar.model.AppUser;

@Repository
public interface IUserRepository extends MongoRepository<AppUser, String> {
	@Query("{name:?0}")
	AppUser findByName(String name);
}
