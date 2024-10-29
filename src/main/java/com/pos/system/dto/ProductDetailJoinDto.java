package com.pos.system.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDetailJoinDto {
    private int code ;
    private String description;
    private ProductDetailDto dto;
}
