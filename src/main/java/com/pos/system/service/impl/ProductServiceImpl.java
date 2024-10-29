package com.pos.system.service.impl;

import com.pos.system.dto.ProductDto;
import com.pos.system.entity.Customer;
import com.pos.system.entity.Product;
import com.pos.system.repo.ProductRepo;
import com.pos.system.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
   private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void saveProduct(ProductDto dto){
        Product product = new Product();
        UUID uuid = UUID.randomUUID();
        long customerId = uuid.getMostSignificantBits();
        product.setDescription(dto.getDescription());
        product.setCode((int) customerId);
        productRepo.save(product);
    }

    @Override
    public void updateProduct(ProductDto dto, String id) {
        Optional<Product> selectedProduct = productRepo.getLastProductId(Long.parseLong(id));
        if (selectedProduct.isEmpty()) throw new RuntimeException();
        selectedProduct.get().setCode(Integer.parseInt(id));
        selectedProduct.get().setDescription(dto.getDescription());
        productRepo.save(selectedProduct.get());
    }

    @Override
    public void deleteProduct(long id) {
        Optional<Product> selectedProduct = productRepo.getLastProductId(id);
        if (selectedProduct.isEmpty()) throw new RuntimeException();
        productRepo.delete(selectedProduct.get());
    }

    @Override
    public List<ProductDto> findAllProducts(){
        List<ProductDto> dtos = new ArrayList<>();
        for (Product p : productRepo.findAll()) {
            dtos.add(new ProductDto(p.getCode(), p.getDescription()));
        }
        return dtos;
    }
}
