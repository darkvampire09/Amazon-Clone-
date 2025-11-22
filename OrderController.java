package com.example.ecommerce.controller;

import com.example.ecommerce.model.*;
import com.example.ecommerce.repository.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
  private final OrderRepository orderRepository;
  private final UserRepository userRepository;
  private final ProductRepository productRepository;

  public OrderController(OrderRepository orderRepository, UserRepository userRepository, ProductRepository productRepository) {
    this.orderRepository = orderRepository;
    this.userRepository = userRepository;
    this.productRepository = productRepository;
  }

  @PostMapping("/checkout")
  public ResponseEntity<?> checkout(@RequestBody Map<String, Object> body) {
    // body expects: userId (Number), total (Number), items (List of maps with id, quantity, price)
    Number userIdNum = (Number) body.get("userId");
    if (userIdNum == null) return ResponseEntity.badRequest().body(Map.of("status","error","message","userId required"));
    Long userId = userIdNum.longValue();
    var userOpt = userRepository.findById(userId);
    if (userOpt.isEmpty()) return ResponseEntity.badRequest().body(Map.of("status","error","message","user not found"));

    Number totalNum = (Number) body.get("total");
    BigDecimal total = totalNum == null ? BigDecimal.ZERO : new BigDecimal(String.valueOf(totalNum));

    @SuppressWarnings("unchecked")
    List<Map<String,Object>> items = (List<Map<String, Object>>) body.get("items");

    OrderEntity order = new OrderEntity();
    order.setUser(userOpt.get());
    order.setTotal(total);

    if (items != null) {
      for (Map<String,Object> it : items) {
        Number pidNum = (Number) it.get("id");
        Number qtyNum = (Number) it.get("quantity");
        Number priceNum = (Number) it.get("price");
        if (pidNum == null) continue;
        Long pid = pidNum.longValue();
        var pOpt = productRepository.findById(pid);
        if (pOpt.isEmpty()) continue;
        Product p = pOpt.get();

        OrderItem oi = new OrderItem();
        oi.setProduct(p);
        oi.setQuantity(qtyNum == null ? 1 : qtyNum.intValue());
        oi.setPrice(priceNum == null ? p.getPrice() : new BigDecimal(String.valueOf(priceNum)));
        order.addItem(oi);
      }
    }

    orderRepository.save(order);
    return ResponseEntity.ok(Map.of("status", "ok", "orderId", order.getId()));
  }
}
