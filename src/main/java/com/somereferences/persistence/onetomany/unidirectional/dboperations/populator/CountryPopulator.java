package com.somereferences.persistence.onetomany.unidirectional.dboperations.populator;

import com.somereferences.persistence.onetomany.unidirectional.models.Country;
import com.somereferences.persistence.onetomany.unidirectional.repository.CountryRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CountryPopulator {

    private CountryRepository countryRepository;

    public CountryPopulator(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> createCountryList() {
        return Arrays.asList(
                Country.builder()
                        .attributeOne("Germany")
                        .attributeTwo("attributeTwoGermany")
                        .attributeThree(123.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("Spain")
                        .attributeTwo("attributeTwoSpain")
                        .attributeThree(174.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("USA")
                        .attributeTwo("attributeTwoEUA")
                        .attributeThree(153.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("Brazil")
                        .attributeTwo("attributeTwoBrazil")
                        .attributeThree(126.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("China")
                        .attributeTwo("attributeTwoChina")
                        .attributeThree(142.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("Russia")
                        .attributeTwo("attributeTwoRussia")
                        .attributeThree(164.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("Russia")
                        .attributeTwo("attributeTwoRussia")
                        .attributeThree(112.00)
                        .creationDate(LocalDate.now())
                        .build(),
                Country.builder()
                        .attributeOne("Italy")
                        .attributeTwo("attributeTwoItaly")
                        .attributeThree(125.00)
                        .creationDate(LocalDate.now())
                        .build()

        );
    }

    public void saveCountryList(){
        List<Country> countries = createCountryList();
        for (Country country : countries) {
            countryRepository.save(country);
        }
    }
}
