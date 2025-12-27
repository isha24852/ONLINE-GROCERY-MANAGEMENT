package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrder;
import java.util.List;

public interface PurchaseOrderService {
    PurchaseOrder addPurchaseOrder(PurchaseOrder po);
    List<PurchaseOrder> getAllPurchaseOrders();
    PurchaseOrder getPurchaseOrderById(Long id);
    PurchaseOrder updatePurchaseOrder(Long id, PurchaseOrder po);
}
