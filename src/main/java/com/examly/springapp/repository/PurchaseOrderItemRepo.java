package com.examly.springapp.repository;

import com.examly.springapp.model.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PurchaseOrderItemRepo extends JpaRepository<PurchaseOrderItem, Long> {
    // This finds items using the purchaseOrderId inside the PurchaseOrder entity
    List<PurchaseOrderItem> findByPurchaseOrderPurchaseOrderId(Long purchaseOrderId);
}
