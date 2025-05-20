package com.telusko.titans.pms.models;

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
    @GeneratedValue
    private Integer brandId;
    @Column(
            nullable = false
    )
    private String BrandName;
    @OneToMany(
            mappedBy = "productBrand",
            cascade = CascadeType.ALL
    )
    private List<Product> products;
}
