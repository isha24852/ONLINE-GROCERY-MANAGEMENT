package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrderItem;
import java.util.List;

public interface PurchaseOrderItemService {
    PurchaseOrderItem addPurchaseOrderItem(PurchaseOrderItem item);
    List<PurchaseOrderItem> getPurchaseOrderItemsByOrderId(Long orderId);
}
