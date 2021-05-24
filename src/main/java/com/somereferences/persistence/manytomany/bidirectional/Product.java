package com.somereferences.persistence.manytomany.bidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product_table")
public class Product {
    @TableGenerator(
            name = "product_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "product_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @OneToMany(mappedBy = "product")
    List<ItemProduct> itemProduct;


}
