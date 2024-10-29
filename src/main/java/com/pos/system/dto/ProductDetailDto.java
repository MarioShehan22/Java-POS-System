package com.pos.system.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDetailDto {
    private String code;
    private String barcode;
    private int qtyOnHand;
    private double sellingPrice;
    private double showPrice;
    private double buyingPrice;
    private int productCode;
    private boolean discountAvailability;
}
