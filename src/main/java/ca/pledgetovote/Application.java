package ca.pledgetovote;

import ca.pledgetovote.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Person p1 = new Person( "Arnav", "Dadarya", 16);
        SpringApplication.run(Application.class, args);
    }
}
