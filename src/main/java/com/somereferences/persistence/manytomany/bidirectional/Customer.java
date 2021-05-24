package com.somereferences.persistence.manytomany.bidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "customer_table")
public class Customer {
    @TableGenerator(
            name = "customer_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "customer_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @OneToMany(mappedBy = "customer")
    private List<ItemProduct> itemProduct;

}
