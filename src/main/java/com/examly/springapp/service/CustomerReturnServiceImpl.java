package com.examly.springapp.service;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.repository.CustomerReturnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerReturnServiceImpl implements CustomerReturnService {

    @Autowired
    private CustomerReturnRepo repo;

    @Override
    public CustomerReturn addCustomerReturn(CustomerReturn customerReturn) {
        return repo.save(customerReturn);
    }

    @Override
    public List<CustomerReturn> getAllCustomerReturns() {
        return repo.findAll();
    }

    @Override
    public CustomerReturn getCustomerReturnById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
