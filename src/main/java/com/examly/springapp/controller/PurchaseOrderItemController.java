package com.examly.springapp.controller;

import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.service.PurchaseOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/purchase-order-items")
public class PurchaseOrderItemController {

    @Autowired
    private PurchaseOrderItemService service;

    @PostMapping
    public ResponseEntity<PurchaseOrderItem> add(@RequestBody PurchaseOrderItem item) {
        return new ResponseEntity<>(service.addPurchaseOrderItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<PurchaseOrderItem>> getByOrderId(@PathVariable Long orderId) {
        return ResponseEntity.ok(service.getPurchaseOrderItemsByOrderId(orderId));
    }
}
