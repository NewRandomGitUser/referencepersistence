package com.somereferences.persistence.onetomany.bidirectional.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee_table")
public class Employee {
    @TableGenerator(
            name = "employee_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Manager manager;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        return id != null && id.equals(((Employee) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
