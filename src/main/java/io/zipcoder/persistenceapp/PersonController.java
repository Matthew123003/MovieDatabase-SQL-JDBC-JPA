package io.zipcoder.persistenceapp;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.create(person), HttpStatus.OK);
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<Person> findPersonById(@PathVariable Long id) {
        return new ResponseEntity<>(personService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> findAll() {
        return new ResponseEntity<>(personService.findAllPersons(), HttpStatus.OK);
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person, @PathVariable Long id) {
        return new ResponseEntity<>(personService.updatePerson(id, person), HttpStatus.OK);
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id) {
        return new ResponseEntity<>(personService.delete(id), HttpStatus.OK);
    }

}
