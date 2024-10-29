package com.pos.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product{
    @Id
    private int code ;

    private String description;

    @OneToOne(mappedBy = "product")
    private ProductDetail productDetail;
}
