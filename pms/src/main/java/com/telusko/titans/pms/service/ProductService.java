package com.telusko.titans.pms.service;

import com.telusko.titans.pms.model.Product;
import com.telusko.titans.pms.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private IProductRepo productRepo;
    @Autowired
    public void setProductRepo(IProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllproducts() {
        return  productRepo.findAll();
    }
}
