package com.somereferences.persistence.onetomany.unidirectional.dboperations.populator;

import com.somereferences.persistence.onetomany.unidirectional.repository.CountryRepository;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.ApplicationPopulator;
import org.springframework.stereotype.Component;

@Component
public class ApplicationPopulatorImpl implements ApplicationPopulator {
    private final CountryRepository countryRepository;
    private final PersonRepository personRepository;

    public ApplicationPopulatorImpl(CountryRepository countryRepository, PersonRepository personRepository) {
        this.countryRepository = countryRepository;
        this.personRepository = personRepository;
    }

    public void execute() {
        CountryPopulator countryPopulator = new CountryPopulator(countryRepository);
        countryPopulator.saveCountryList();
        PersonPopulator personPopulator = new PersonPopulator(personRepository);
        personPopulator.savePersonList();
        PersonCountryAttributor personCountryAttributor = new PersonCountryAttributor(personRepository, countryRepository);
        personCountryAttributor.makeAttributions();
    }
}
