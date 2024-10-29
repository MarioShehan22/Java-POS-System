package com.pos.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetail {
    @Id
    private String code;
    private int qtyOnHand;
    private double sellingPrice;
    private double showPrice;
    private double buyingPrice;
    private boolean discountAvailability;
    @OneToOne
    @JoinColumn(name = "product", unique = true)
    private Product product;
    @ManyToMany(mappedBy = "productDetail")
    private Set<OrderDetail> orders = new HashSet<>();
}
