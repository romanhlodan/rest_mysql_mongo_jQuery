package com.ua.hrv.dao;

import com.ua.hrv.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends MongoRepository<Person, String> {
}
