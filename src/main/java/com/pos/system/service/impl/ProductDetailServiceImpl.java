package com.pos.system.service.impl;

import com.pos.system.dto.ProductDetailDto;
import com.pos.system.dto.ProductDetailJoinDto;
import com.pos.system.entity.Customer;
import com.pos.system.entity.ProductDetail;
import com.pos.system.repo.CustomerRepo;
import com.pos.system.repo.ProductDetailRepo;
import com.pos.system.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductDetailServiceImpl implements ProductDetailService {
    private final ProductDetailRepo productDetailRepo;

    @Autowired
    public ProductDetailServiceImpl(ProductDetailRepo productDetailRepo) {
        this.productDetailRepo = productDetailRepo;
    }

    @Override
    public void saveProductDetail(ProductDetailDto dto) throws SQLException, ClassNotFoundException {
        UUID uuid = UUID.randomUUID();
        long id = uuid.getMostSignificantBits();
        ProductDetail productDetail = new ProductDetail();
        productDetail.setCode(String.valueOf(id));
        productDetail.setBuyingPrice(dto.getBuyingPrice());
        productDetail.setSellingPrice(dto.getSellingPrice());
        productDetail.setShowPrice(dto.getShowPrice());
        productDetail.setQtyOnHand(dto.getQtyOnHand());
        productDetail.setDiscountAvailability(dto.isDiscountAvailability());
        //productDetail.setProduct();
        productDetailRepo.save(productDetail);
    }

    @Override
    public List<ProductDetailDto> findAllProductDetails(int productCode) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ProductDetailDto findProductDetail(String code) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ProductDetailJoinDto findProductJoinDetail(String code) throws SQLException, ClassNotFoundException {
        return null;
    }
}
