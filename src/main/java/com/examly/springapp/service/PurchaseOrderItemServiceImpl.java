package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.repository.PurchaseOrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderItemServiceImpl implements PurchaseOrderItemService {

    @Autowired
    private PurchaseOrderItemRepo repo;

    @Override
    public PurchaseOrderItem addPurchaseOrderItem(PurchaseOrderItem item) {
        return repo.save(item);
    }

    @Override
    public List<PurchaseOrderItem> getPurchaseOrderItemsByOrderId(Long orderId) {
        // This method relies on the custom finder in PurchaseOrderItemRepo
        return repo.findByPurchaseOrderPurchaseOrderId(orderId);
    }
}
