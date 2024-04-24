package io.zipcoder.persistenceapp;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //POST /people -- create a person
    @PostMapping("/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.ok(personService.addPerson(person));
    }

    //PUT /people/{id} -- update person with id. 404 error if that person doesn't exist yet
    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person, @PathVariable Long id) {
        return ResponseEntity.ok(personService.updatePerson(person, id));
    }

    //GET /people/{id} -- get the person with the specified ID
    @GetMapping("/people/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getById(id));
    }

    //DELETE /people/{id} -- delete the person with the specified ID
    @DeleteMapping("/people/{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id) {
        return ResponseEntity.ok(personService.removePerson(id));
    }

    //GET /people -- get all people
    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return ResponseEntity.ok(personService.findAll());
    }

    //GET /people/reverselookup/{mobileNumber} -- find all people with the specified mobile number
    @GetMapping("/people/reverselookup/{mobileNumber}")
    public ResponseEntity<Person> getAllPeopleByMobileNumber(@PathVariable String mobileNumber) {
        return ResponseEntity.ok(personService.getByPhoneNumber(mobileNumber));
    }

    //people/surname/{lastName} -- Find all people with a particular last name
    @GetMapping("/people/surname/{lastName}")
    public ResponseEntity<Iterable<Person>> getAllPeopleByLastName(@PathVariable String lastName) {
        return ResponseEntity.ok(personService.getByLastName(lastName));
    }

    //people/firstname/{firstName} -- Find all people with a particular first name
    @GetMapping("/people/firstname/{firstName}")
    public ResponseEntity<Iterable<Person>> getAllPeopleByFirstName(@PathVariable String firstName) {
        return ResponseEntity.ok(personService.getByFirstName(firstName));
    }

    //people/firstname/stats -- Get the report of first name frequencies
    @GetMapping("/people/firstname/stats")
    public ResponseEntity<Map<String, Integer>> getFirstNameStats() {
        return ResponseEntity.ok(personService.getFirstNameStats());
    }

}
