package com.telusko.titans.pms.repo;

import com.telusko.titans.pms.model.ProductBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductBrand extends JpaRepository<ProductBrand,Integer> {
}
