package com.pos.system.service;

import com.pos.system.dto.ProductDetailDto;
import com.pos.system.dto.ProductDetailJoinDto;
import java.sql.SQLException;
import java.util.List;

public interface ProductDetailService {
    public void saveProductDetail(ProductDetailDto dto) throws SQLException, ClassNotFoundException;
    public List<ProductDetailDto> findAllProductDetails(int productCode) throws SQLException, ClassNotFoundException;
    public ProductDetailDto findProductDetail(String code) throws SQLException, ClassNotFoundException;
    public ProductDetailJoinDto findProductJoinDetail(String code) throws SQLException, ClassNotFoundException;
}
