package io.zipcoder.persistenceapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Optional<Person> findById(long id);

    void deleteById(Long id);
}
