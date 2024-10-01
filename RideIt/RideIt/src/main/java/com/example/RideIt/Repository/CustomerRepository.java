package com.example.RideIt.Repository;

import com.example.RideIt.Enum.Gender;
import com.example.RideIt.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select c from Customer c where c.gender = :g and c.age >= :age")
    List<Customer> getByGenderAndAgeGreaterThan(Gender g, int age);
}
