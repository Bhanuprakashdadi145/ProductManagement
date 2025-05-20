package com.telusko.titans.pms;

import com.github.javafaker.Faker;
import com.telusko.titans.pms.model.Product;
import com.telusko.titans.pms.model.ProductBrand;
import com.telusko.titans.pms.model.ProductCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(PmsApplication.class, args);
	}


}
