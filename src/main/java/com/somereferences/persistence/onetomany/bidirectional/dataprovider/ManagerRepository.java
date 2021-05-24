package com.somereferences.persistence.onetomany.bidirectional.dataprovider;

import com.somereferences.persistence.onetomany.bidirectional.models.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository <Manager, Long> {
}
