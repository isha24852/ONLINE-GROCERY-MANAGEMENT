package com.examly.springapp.service;

import com.examly.springapp.model.Supplier;
import com.examly.springapp.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        // Day10_testAddSupplier: Saves the supplier and returns it
        return supplierRepo.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        // Day10_testGetAllSuppliers: Returns all records from the database
        return supplierRepo.findAll();
    }

    @Override
    public Supplier getSupplierById(Long id) {
        // Day10_testGetSupplierById: Finds supplier by supplierId
        return supplierRepo.findById(id).orElse(null);
    }

    @Override
    public Supplier updateSupplier(Long id, Supplier supplierDetails) {
        // Day10_testUpdateSupplier: Updates specific fields expected by the test
        return supplierRepo.findById(id).map(existingSupplier -> {
            existingSupplier.setSupplierName(supplierDetails.getSupplierName());
            existingSupplier.setContactNumber(supplierDetails.getContactNumber());
            existingSupplier.setEmail(supplierDetails.getEmail());
            existingSupplier.setAddress(supplierDetails.getAddress());
            return supplierRepo.save(existingSupplier);
        }).orElse(null);
    }
}
