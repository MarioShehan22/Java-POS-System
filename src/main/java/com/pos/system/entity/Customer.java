package com.pos.system.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer{
    @Id
    private long id;
    private String email;
    private String name;
    private String contact;
    private double salary;

    @OneToOne(mappedBy = "customer")
    @Nullable
    private LoyaltyCard loyaltyCard;
}
