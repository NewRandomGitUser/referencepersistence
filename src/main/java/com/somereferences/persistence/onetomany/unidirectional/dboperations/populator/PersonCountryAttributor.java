package com.somereferences.persistence.onetomany.unidirectional.dboperations.populator;

import com.somereferences.persistence.onetomany.unidirectional.models.Country;
import com.somereferences.persistence.onetomany.unidirectional.models.Person;
import com.somereferences.persistence.onetomany.unidirectional.repository.CountryRepository;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;

import java.util.Optional;

public class PersonCountryAttributor {
    private PersonRepository personRepository;
    private CountryRepository countryRepository;

    public PersonCountryAttributor(PersonRepository personRepository,
                                   CountryRepository countryRepository){
        this.personRepository = personRepository;
        this.countryRepository = countryRepository;
    }

    public void attributeCountryWithIdToPersonWithId(Long countryId, Long personId){
        Optional<Person> person = personRepository.findById(personId);
        Optional<Country> country = countryRepository.findById(countryId);
        if(!person.isEmpty() && !country.isEmpty())
            person.get().setCountry(country.get());
            personRepository.save(person.get());
    }

    public void makeAttributions(){
        attributeCountryWithIdToPersonWithId(1L,1L);
        attributeCountryWithIdToPersonWithId(5L,2L);
        attributeCountryWithIdToPersonWithId(6L,3L);
        attributeCountryWithIdToPersonWithId(7L,4L);
        attributeCountryWithIdToPersonWithId(2L,5L);
        attributeCountryWithIdToPersonWithId(2L,6L);
        attributeCountryWithIdToPersonWithId(1L,7L);
    }










}
