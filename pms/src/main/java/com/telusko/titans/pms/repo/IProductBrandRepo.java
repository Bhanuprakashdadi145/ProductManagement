package com.telusko.titans.pms.repo;

import com.telusko.titans.pms.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telusko.titans.pms.model.ProductBrand;

import java.util.List;

@Repository
public interface IProductBrandRepo extends JpaRepository<ProductBrand, Integer> {

	ProductBrand findByBrandNameIgnoreCase(String productBrand);






}
