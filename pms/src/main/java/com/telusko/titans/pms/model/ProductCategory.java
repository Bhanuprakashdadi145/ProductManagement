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
public class ProductCategory {
     @Id
//     @GeneratedValue(
//             generator = "sequence",
//             strategy = GenerationType.SEQUENCE
//     )
//     @SequenceGenerator(
//             name="sequence",
//             sequenceName = "sequence",
//             initialValue = 1000,
//             allocationSize = 1
//     )
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;
    @Column(
            nullable = false
    )
    private String categoryName;

    private String catergoryOccasion;
    @Column(
            nullable = false
    )
    private String categoryConsumerGender;
    @OneToMany(
            mappedBy = "productCategory",
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private List<Product> products;
}
