package com.pos.system.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDetailDto {
    private String detailCode;
    private int qty;
    private double discount;
    private double amount;
}
