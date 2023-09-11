package com.kmr.batch.poc.batchpoc.repository;

import com.kmr.batch.poc.batchpoc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
