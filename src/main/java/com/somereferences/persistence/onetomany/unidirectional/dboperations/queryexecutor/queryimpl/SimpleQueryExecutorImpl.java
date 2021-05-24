package com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.queryimpl;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.SimpleQueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.models.Person;
import com.somereferences.persistence.onetomany.unidirectional.repository.PersonRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SimpleQueryExecutorImpl implements SimpleQueryExecutor {
    private final PersonRepository personRepository;

    public SimpleQueryExecutorImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void printFindUsingAttributeOneOrAttributeTwo(String attributeOne, String attributeTwo) {
        List<Person> people = personRepository.findUsingAttributeOneOrAttributeTwo(attributeOne,attributeTwo);
        people.forEach(p-> System.out.println(p.getAttributeOne()));
    }

}
