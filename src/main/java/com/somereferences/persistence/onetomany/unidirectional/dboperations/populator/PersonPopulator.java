package com.somereferences.persistence.onetomany.unidirectional.dboperations.populator;


import com.somereferences.persistence.onetomany.unidirectional.models.Person;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PersonPopulator {
    private PersonRepository personRepository;

    public PersonPopulator(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> createPersonList() {
        return Arrays.asList(
                Person.builder()
                      .attributeOne("James")
                      .attributeTwo("Holyster")
                      .attributeThree(1232)
                      .creationDate(LocalDate.now())
                      .build(),
                Person.builder()
                        .attributeOne("Mary")
                        .attributeTwo("Jane")
                        .attributeThree(15321)
                        .creationDate(LocalDate.now())
                        .build(),
                Person.builder()
                        .attributeOne("Jack")
                        .attributeTwo("Danny")
                        .attributeThree(24321)
                        .creationDate(LocalDate.now())
                        .build(),
                Person.builder()
                        .attributeOne("Peter")
                        .attributeTwo("Park")
                        .attributeThree(24321)
                        .creationDate(LocalDate.now())
                        .build(),
                Person.builder()
                        .attributeOne("Ane")
                        .attributeTwo("Holly")
                        .attributeThree(25321)
                        .creationDate(LocalDate.now())
                        .build(),
                Person.builder()
                        .attributeOne("Richard")
                        .attributeTwo("Strauss")
                        .attributeThree(23321)
                        .creationDate(LocalDate.now())
                        .build(),
                Person.builder()
                        .attributeOne("Kate")
                        .attributeTwo("Broken")
                        .attributeThree(14321)
                        .creationDate(LocalDate.now())
                        .build()

        );
    }

    public void savePersonList() {
        personRepository.saveAll(createPersonList());
    }
}
