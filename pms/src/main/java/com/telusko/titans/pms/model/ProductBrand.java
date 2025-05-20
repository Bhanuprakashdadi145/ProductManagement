package com.telusko.titans.pms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ProductBrand {
    @Id
//    @GeneratedValue(
//            generator = "brand_seq",
//            strategy = GenerationType.SEQUENCE
//    )
//    @SequenceGenerator(
//            name = "brand_seq",
//            initialValue = 1,
//            allocationSize = 1,
//            sequenceName = "brand_seq"
//    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brandId;
    @Column(
            nullable = false
    )
    private String BrandName;
    @OneToMany(
            mappedBy = "productBrand",
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private List<Product> products;
}
