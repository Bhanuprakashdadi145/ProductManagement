package com.telusko.titans.pms.repo;

import com.telusko.titans.pms.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.titans.pms.model.Product;

@Repository
public interface IProductRepoCategory extends JpaRepository<ProductCategory, Integer> {

}
