package com.somereferences.persistence.manytomany.bidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "itemProduct_table")
public class ItemProduct {
    @TableGenerator(
            name = "itemProduct_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "itemProduct_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
