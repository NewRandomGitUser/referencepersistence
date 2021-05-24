package com.somereferences.persistence.onetomany.unidirectional.repository;

import com.somereferences.persistence.onetomany.unidirectional.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
