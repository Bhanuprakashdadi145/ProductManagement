package com.telusko.titans.pms.config;

import com.github.javafaker.Faker;
import com.telusko.titans.pms.model.Product;
import com.telusko.titans.pms.model.ProductBrand;
import com.telusko.titans.pms.model.ProductCategory;
import com.telusko.titans.pms.repo.IProductBrand;
import com.telusko.titans.pms.repo.IProductCategoryRepo;
import com.telusko.titans.pms.repo.IProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.module.ResolutionException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Component
public class Configuration implements CommandLineRunner {
    private IProductBrand brandRepo;
    private IProductRepo productRepo;
    private IProductCategoryRepo categoryRepo;

    public Configuration(IProductBrand brandRepo, IProductRepo productRepo, IProductCategoryRepo categoryRepo) {
        this.brandRepo = brandRepo;
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Faker faker = new Faker();
            ProductBrand productBrand1 = ProductBrand.builder()
                    .BrandName(faker.company().name()).build();
            brandRepo.save(productBrand1);
        }
        for (int i = 0; i < 10; i++) {
            Faker faker = new Faker();
            ProductCategory category = ProductCategory.builder()
                    .categoryName(faker.commerce().department())
                    .catergoryOccasion(faker.lorem().word())
                    .categoryConsumerGender(faker.options().option("Male", "Female", "Unisex"))
                    .build();

            categoryRepo.save(category);
        }


        Faker faker = new Faker();

        List<ProductBrand> brands = brandRepo.findAll();
        List<ProductCategory> categories = categoryRepo.findAll();

        for (int i = 0; i < 10; i++) {
            Product product = Product.builder()
                    .productName(faker.commerce().productName())
                    .productPrice(new BigDecimal(faker.commerce().price(1000.0, 10000.0)))
                    .productRating(faker.number().randomDouble(1, 1, 5))
                    .productQuantity(BigInteger.valueOf(faker.number().numberBetween(10, 500)))
                    .productBrand(faker.options().nextElement(brands))
                    .productCategory(faker.options().nextElement(categories))
                    .build();

            productRepo.save(product);


        }
    }
}
