package com.data.repository;

 
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.data.entity.Version;


public interface VRepo extends MongoRepository<Version, String> {
    Optional<Version> findByVersion(String version); 
} 
 