package com.examly.springapp.service;

import com.examly.springapp.model.CustomerReturn;
import java.util.List;

public interface CustomerReturnService {
    CustomerReturn addCustomerReturn(CustomerReturn customerReturn);
    List<CustomerReturn> getAllCustomerReturns();
    CustomerReturn getCustomerReturnById(Long id);
}
