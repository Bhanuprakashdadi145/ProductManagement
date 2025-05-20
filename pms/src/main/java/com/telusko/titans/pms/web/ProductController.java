package com.telusko.titans.pms.web;

import com.telusko.titans.pms.model.Product;
import com.telusko.titans.pms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private IProductService productService;
    @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> fetchAllProducts(){
         List<Product> products=productService.getAllproducts();

        return  new ResponseEntity<>(products, HttpStatus.OK);
    }

}
