package com.telusko.titans.pms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
   @Id
//   @GeneratedValue(
//           generator = "sequenceForProduct",
//           strategy = GenerationType.SEQUENCE
//   )
//   @SequenceGenerator(
//           name = "sequenceForProduct",
//           sequenceName = "sequenceForProduct",
//           initialValue = 100,
//           allocationSize = 1
//   )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    @Column(
            nullable = false
    )
    private String productName;
    @Column(
            nullable = false,
            precision = 10,
            scale = 2
    )
    private BigDecimal productPrice;

    private Double productRating;
    @Lob
    private Byte[] productImage;

    private BigInteger productQuantity;
    @ManyToOne
    @JoinColumn(
            name = "product_category_id",
            nullable = false
    )
    private ProductCategory productCategory;
    @ManyToOne
    @JoinColumn(
            name = "product_brand_id",
            nullable = false
    )
   private ProductBrand productBrand;

}
