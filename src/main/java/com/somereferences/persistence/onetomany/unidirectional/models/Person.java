package com.somereferences.persistence.onetomany.unidirectional.models;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person_table")
public class Person {
    @TableGenerator(
            name = "person_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "person_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    //Eager loading is the default FetchMode for @ManyToOne
    //Set fetch = FetchType.LAZY in order to prevent some unnecessary queries
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    public String getAttributeTwo() {
        return attributeTwo;
    }
    public double getAttributeThree() {
        return attributeThree;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Country getCountry() {
        return country;
    }
}
