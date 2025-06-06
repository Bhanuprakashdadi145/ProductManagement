package com.telusko.titans.pms.service;

import com.telusko.titans.pms.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import com.telusko.titans.pms.dto.ProductDto;

import java.util.List;

public interface IProductService {
	
	ProductDto addProduct(ProductDto brand);

	ProductDto updateProduct(Integer id, ProductDto productDto);

	Page<ProductDto> getAllProducts(Pageable pageable);

	ProductDto getProductById(int id);

	List<Product> searchByTheName(String keyword);

	Page<Product> searchByTheProductPriceRange(double min,double max , Pageable pageable);

	Page<ProductDto> searchProductsByBrand(String brandName,Pageable pageable);

}
