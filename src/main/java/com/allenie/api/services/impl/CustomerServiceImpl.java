package com.allenie.api.services.impl;

import org.springframework.stereotype.Component;
import com.allenie.api.dto.Customer;
import com.allenie.api.services.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {

  @Override
  public Customer searchCustomer(String id) {
    if (!"001".equals(id)) {
      return new Customer();
    }
    // Return stub object
    Customer customer = new Customer();
    customer.setId(id);
    customer.setName("TEST STUB");
    customer.setAge(32);
    return customer;
  }

}
