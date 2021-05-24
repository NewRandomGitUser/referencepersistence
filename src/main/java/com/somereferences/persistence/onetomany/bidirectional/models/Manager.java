package com.somereferences.persistence.onetomany.bidirectional.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "manager_table")
public class Manager {
    @TableGenerator(
            name = "manager_table_generator",
            allocationSize = 1,
            initialValue = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "manager_table_generator")
    private Long id;
    private String attributeOne;
    private String attributeTwo;
    private double attributeThree;
    private LocalDate creationDate;
    @OneToMany(mappedBy = "manager")
    List<Employee> employee;
}
