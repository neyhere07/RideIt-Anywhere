package com.example.RideIt.Controller;

import com.example.RideIt.Enum.Gender;
import com.example.RideIt.Service.CustomerService;
import com.example.RideIt.dto.Request.CustomerRequest;
import com.example.RideIt.dto.Response.CustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CustomerController {
    private final CustomerService customerService;

    CustomerController(CustomerService customerService){this.customerService=customerService;
    }

    @PostMapping("/api/addCustomer")
    public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest customerRequest){

        CustomerResponse response=customerService.addCustomer(customerRequest);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/gender/{gender}/age/{age}")
    public ResponseEntity<List<CustomerResponse>> getCustomerAgeandGender(@PathVariable("gender") Gender gender,
                                                                          @PathVariable("age")int age) {

        List<CustomerResponse> responses = customerService.getCustomerAgeandGender(gender, age);

        return new ResponseEntity<>(responses, HttpStatus.FOUND);
    }
}
