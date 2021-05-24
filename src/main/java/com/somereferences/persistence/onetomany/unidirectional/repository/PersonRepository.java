package com.somereferences.persistence.onetomany.unidirectional.repository;

import com.somereferences.persistence.onetomany.unidirectional.models.Person;
import com.somereferences.persistence.onetomany.unidirectional.models.projectiondto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    //using optional return
    Optional<Person> findByAttributeOne(String attributeOne);

    @Query("SELECT person FROM Person person WHERE person.attributeOne = 'Mary'")
    List<Person> findAllMary();

    //same as findById(), but return Person as oppose to Optional<Person>
    @Query("SELECT person FROM Person person WHERE person.id = :id")
    Person findUsingId(Long id);

    //same as findByName(), but return Person as oppose to Optional<Person>
    @Query("SELECT person FROM Person person WHERE person.attributeOne = :attributeOne")
    Person findUsingAttributeOne(String attributeOne);

    //using simple connectivity operators

    @Query("SELECT person FROM Person person WHERE person.attributeOne = :attributeOne AND person.attributeTwo = :attributeTwo")
    Person findUsingAttributeOneAndAttributeTwo(String attributeOne, String attributeTwo);

    @Query("SELECT person FROM Person person WHERE person.attributeOne = :attributeOne OR person.attributeTwo = :attributeTwo")
    List<Person> findUsingAttributeOneOrAttributeTwo(String attributeOne, String attributeTwo);

    //using some sorting criterion

    @Query("SELECT person FROM Person person WHERE person.attributeThree > :value ORDER BY person.attributeTwo")
    List<Person> findBiggerThanAttributeThreeOrderByAttributeTwo(double value);

    //composite key query

    List<Person> findByCountryAttributeOne(String AttributeOne);

    //using pagination

    @Query("SELECT person FROM Person person WHERE person.attributeOne = :attributeOne")
    Page<Person> findByAttributeOne(Pageable pageable, String attributeOne);

    @Query("SELECT person FROM Person person WHERE person.attributeThree < :attributeThree")
    Page<Person> findLessThanAttributeThree(Pageable pageable, double attributeThree);

    //using class based projection

    @Query("SELECT new com.somereferences.persistence.onetomany.unidirectional.models.projection.PersonDto (p.attributeTwo, p.attributeThree) FROM Person p")
    List<PersonDto> getAllAttributeTwoAttributeThree();

    //using interface based projection

    // using criteriaQuery

    //(Create specifications), Solve the n+1 queries problems with and without pagination

    //    @Query("SELECT p.attributeTwo, p.attributeThree FROM Person p")
    //    List<FirstPersonProjection> findByAttribute();
}
