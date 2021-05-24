package com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.queryimpl;

import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.PaginationQueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.QueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.models.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PaginationQueryExecutorImpl implements PaginationQueryExecutor {

    private final PersonRepository personRepository;

    public PaginationQueryExecutorImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void printFindLessThanAttributeThreePageSizeValue(int page, int size, double value) {
        Pageable pageable = PageRequest.of(page,size, Sort.unsorted());
        Page<Person> people = personRepository.findLessThanAttributeThree(pageable, value);
        people.forEach(p-> System.out.println(p.getAttributeOne()));
    }
}
