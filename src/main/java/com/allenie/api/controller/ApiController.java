package com.allenie.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.allenie.api.dto.Customer;
import com.allenie.api.services.CustomerService;

@RestController
@RequestMapping("/api")
public class ApiController {
  
  CustomerService customerService;
  
  public ApiController(CustomerService customerService) {
    this.customerService = customerService;
  }

  /**
   * Return customer object if id is equal to 001.
   * If id is not 001, return empty customer object.
   * 
   * Sample URL: http://localhost:8080/api/customers?id=001
   * 
   * @param id ID
   * @return customer if id matched
   */
  @GetMapping("/customers")
  public Customer getCustomer(@RequestParam(value="id") String id) {
    return customerService.searchCustomer(id);
  }
}
