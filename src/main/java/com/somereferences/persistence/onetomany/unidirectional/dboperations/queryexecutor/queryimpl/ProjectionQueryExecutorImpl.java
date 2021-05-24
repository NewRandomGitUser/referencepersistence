package com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.queryimpl;

import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.ProjectionQueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectionQueryExecutorImpl implements ProjectionQueryExecutor {
    private final PersonRepository personRepository;

    public ProjectionQueryExecutorImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void printGetAllAttributeTwoAttributeThree() {
        personRepository.getAllAttributeTwoAttributeThree().forEach(p-> System.out.println(p.getAttributeTwo()));
    }

}
