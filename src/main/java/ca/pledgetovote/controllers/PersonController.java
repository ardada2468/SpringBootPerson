package ca.pledgetovote.controllers;

import ca.pledgetovote.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;
import java.util.ArrayList;

@RestController
public class PersonController {

    @GetMapping("/getPeople")
    public static ArrayList<Person> getPeople(){return Person.getPeople();}

    @GetMapping("/getPerson")
    public static Person getPerson(@RequestParam("id") long id){return Person.getPerson(id);}

    @PostMapping("/createPerson")
    public static Person CreatePerson(@RequestParam("FirstName") String firstName,
                         @RequestParam("LastName") String lastName,
                         @RequestParam("Age") int age
                        ){
        Person p = new Person(firstName,lastName, age);
        return p;
    }

    @GetMapping("/updatePerson")
    public static Person updatePerson(
            @RequestParam("Id") long id,
            @RequestParam("Age") int age
    ) {
        Person.getPerson(id).setAge(age);
        return Person.getPerson(id);
    }

    }



