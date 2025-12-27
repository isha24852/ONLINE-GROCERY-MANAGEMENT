package com.examly.springapp.controller;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.service.CustomerReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customer-returns")
public class CustomerReturnController {

    @Autowired
    private CustomerReturnService service;

    @PostMapping
    public ResponseEntity<CustomerReturn> addCustomerReturn(@RequestBody CustomerReturn customerReturn) {
        CustomerReturn created = service.addCustomerReturn(customerReturn);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CustomerReturn>> getAllCustomerReturns() {
        return new ResponseEntity<>(service.getAllCustomerReturns(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerReturn> getCustomerReturnById(@PathVariable Long id) {
        CustomerReturn cr = service.getCustomerReturnById(id);
        return cr != null ? ResponseEntity.ok(cr) : ResponseEntity.notFound().build();
    }
}
