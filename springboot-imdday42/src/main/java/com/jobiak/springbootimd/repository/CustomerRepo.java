package com.jobiak.springbootimd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.springbootimd.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
