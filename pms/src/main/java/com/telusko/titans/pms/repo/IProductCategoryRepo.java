package com.telusko.titans.pms.repo;

import com.telusko.titans.pms.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

}
