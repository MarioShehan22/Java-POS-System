package com.pos.system.repo;

import com.pos.system.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepo extends JpaRepository<ProductDetail, Long> {
//    public List<ProductDetail> findAllProductDetails(int productCode) throws SQLException, ClassNotFoundException;
//
//    public ProductDetail findProductDetail(String code) throws SQLException, ClassNotFoundException;
//    public ProductDetailJoinDto findProductDetailJoinData(String code) throws SQLException, ClassNotFoundException;
//
//    public boolean manageQty(String barcode, int qty) throws SQLException, ClassNotFoundException;
}
