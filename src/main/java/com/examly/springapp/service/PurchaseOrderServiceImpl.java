package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrder;
import com.examly.springapp.repository.PurchaseOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepo repo;

    @Override
    public PurchaseOrder addPurchaseOrder(PurchaseOrder po) {
        return repo.save(po);
    }

    @Override
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return repo.findAll();
    }

    @Override
    public PurchaseOrder getPurchaseOrderById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public PurchaseOrder updatePurchaseOrder(Long id, PurchaseOrder po) {
        if (repo.existsById(id)) {
            po.setPurchaseOrderId(id);
            return repo.save(po);
        }
        return null;
    }
}
