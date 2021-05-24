package com.somereferences.persistence.onetomany.bidirectional.dataprovider;

import com.somereferences.persistence.onetomany.bidirectional.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
