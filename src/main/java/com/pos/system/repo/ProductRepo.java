package com.pos.system.repo;

import com.pos.system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM Product p WHERE code=?")
    Optional<Product> getLastProductId(long productId);

//    @Query("SELECT p FROM Product p WHERE p.description LIKE %?1%")
//    List<Product> findByNameContaining(String description);
}
