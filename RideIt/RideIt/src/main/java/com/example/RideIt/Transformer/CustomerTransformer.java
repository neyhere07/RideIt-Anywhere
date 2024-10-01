package com.example.RideIt.Transformer;

import com.example.RideIt.Models.Customer;
import com.example.RideIt.dto.Request.CustomerRequest;
import com.example.RideIt.dto.Response.CustomerResponse;

public class CustomerTransformer {
    public Customer customerRequestToCustomer(CustomerRequest customerRequest){

        Customer customer=Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .address((customerRequest.getAddress()))
                .emailId(customerRequest.getEmailId())
                .gender(customerRequest.getGender())
                .build();

        return customer;
    }

    public CustomerResponse customerToCustomerResponse(Customer customer){
        CustomerResponse response1=CustomerResponse.builder()
                .name(customer.getName())
                .emailId(customer.getEmailId())
                .build();

        return response1;
    }
}
