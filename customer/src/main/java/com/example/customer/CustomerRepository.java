package com.example.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="customer")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}