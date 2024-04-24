package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;

@Service
public class PersonService {
    @Autowired
    private final PersonRepository repo;

    public PersonService(PersonRepository repo){
        this.repo = repo;
    }

    //read
    public Person findById(long id) {
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public Iterable<Person> findAllPersons() {
        return repo.findAll();
    }

    //create
    public Person create(Person person) {
        return repo.save(person);
    }
//    public Iterable<Person> createMultiple(Iterable<Person> people) {
//        return repo.saveAll(people);
//    }

    //update
    public Person updatePerson(Long id, Person person){
        Person personToUpdate = repo.findById(id).orElseThrow(EntityNotFoundException::new);
        personToUpdate.setFName(person.getFName());
        personToUpdate.setLName(person.getLName());
        personToUpdate.setMobileNumber(person.getMobileNumber());
        personToUpdate.setBDate(person.getBDate());
        personToUpdate.setHomeId(person.getHomeId());

        return repo.save(personToUpdate);
    }

    //delete
    public boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
