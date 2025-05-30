package com.telusko.titans.pms.repo;

import com.telusko.titans.pms.model.Product;
<<<<<<< HEAD
=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> 667e8afb4d9a17c9ba9eb372ad221440396b7082
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telusko.titans.pms.model.ProductBrand;

import java.util.List;

@Repository
public interface IProductBrandRepo extends JpaRepository<ProductBrand, Integer> {

	ProductBrand findByBrandNameIgnoreCase(String productBrand);

<<<<<<< HEAD




=======
    @Query("SELECT p FROM Product p WHERE LOWER(p.productBrand.brandName) LIKE LOWER(CONCAT('%',:name,'%'))")
    Page<Product> findByBrandNameContainingIgnoreCase(@Param("name") String name, Pageable pageable);
>>>>>>> 667e8afb4d9a17c9ba9eb372ad221440396b7082

}
