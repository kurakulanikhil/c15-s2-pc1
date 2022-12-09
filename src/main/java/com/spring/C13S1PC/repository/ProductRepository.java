package com.spring.C13S1PC.repository;

import com.spring.C13S1PC.domain.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

    List<Product> findByproductName( String productName);


}
