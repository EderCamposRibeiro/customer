package org.acme.service;

import org.acme.dto.CustomerDTO;
import org.acme.entity.CustomerEntity;
import org.acme.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    public List<CustomerDTO> findAllCustomer(){

        List<CustomerDTO> customers = new ArrayList<>();

        customerRepository.findAll().stream().forEach(item -> {
                customers.add(mapCustomerEntityDTO(item));
        });

        return customers;

    }

    private CustomerDTO mapCustomerEntityDTO(CustomerEntity customer){

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setAddress(customer.getAddress());
        customerDTO.setAge(customer.getAge());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setName(customer.getName());
        customerDTO.setPhone(customer.getPhone());

        return customerDTO;
    }
}
