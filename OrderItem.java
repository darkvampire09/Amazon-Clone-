package com.example.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "order_items")
public class OrderItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private OrderEntity order;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  private Integer quantity;

  private BigDecimal price;

  // getters/setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public OrderEntity getOrder() { return order; }
  public void setOrder(OrderEntity order) { this.order = order; }
  public Product getProduct() { return product; }
  public void setProduct(Product product) { this.product = product; }
  public Integer getQuantity() { return quantity; }
  public void setQuantity(Integer quantity) { this.quantity = quantity; }
  public BigDecimal getPrice() { return price; }
  public void setPrice(BigDecimal price) { this.price = price; }
}
