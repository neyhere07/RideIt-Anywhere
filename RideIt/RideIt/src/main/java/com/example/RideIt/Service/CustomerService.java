package com.example.RideIt.Service;

import com.example.RideIt.Enum.Gender;
import com.example.RideIt.Models.Customer;
import com.example.RideIt.Repository.CustomerRepository;
import com.example.RideIt.Transformer.CustomerTransformer;
import com.example.RideIt.dto.Request.CustomerRequest;
import com.example.RideIt.dto.Response.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository){this.customerRepository=customerRepository;
    }

    CustomerTransformer customerTransformer=new CustomerTransformer();
    public CustomerResponse addCustomer(CustomerRequest customerRequest){

        Customer customer=customerTransformer.customerRequestToCustomer(customerRequest);

        Customer savedCustomer=customerRepository.save(customer);

        CustomerResponse response1=customerTransformer.customerToCustomerResponse(customer);

        return response1;
    }

    public List<CustomerResponse> getCustomerAgeandGender(Gender gender, int age){
        List<Customer>customerList=customerRepository.getByGenderAndAgeGreaterThan(gender,age);

        List<CustomerResponse>responseList=new ArrayList<>();

        for(Customer customer:customerList){

            responseList.add(customerTransformer.customerToCustomerResponse(customer));
        }

        return responseList;
    }
}
