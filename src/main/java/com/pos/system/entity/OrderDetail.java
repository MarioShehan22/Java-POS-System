package com.pos.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetail{
    @Id
    private int orderId;
    private Date issuedDate;
    private double totalCost;
    private String customerEmail;
    private double discount;
    private String operatorEmail;

    @ManyToMany
    @JoinTable(name = "product_orderDetail",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns =   @JoinColumn(name = "code")
    )
    private Set<ProductDetail> productDetail =new HashSet<>();
}
