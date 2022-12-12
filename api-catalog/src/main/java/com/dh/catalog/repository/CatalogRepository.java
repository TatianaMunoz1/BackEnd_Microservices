package com.dh.catalog.repository;


import com.dh.catalog.entity.Pattern;
import com.dh.catalog.entity.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends MongoRepository<Serie, String> {

}
