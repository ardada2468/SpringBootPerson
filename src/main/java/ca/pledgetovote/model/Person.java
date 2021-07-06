package ca.pledgetovote.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private static int ID= 0;
    long id;
    String FirstName;
    String LastName;
    int age;
    public static ArrayList<Person> People = new ArrayList<>();
    private static Map <Long, Person> IDPeople = new HashMap<>();
    public Person(String firstName, String lastName, int age) {
        this.id = ID++;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        IDPeople.put(id,this);
        getPeople().add(this);
    }

    public static Person getPerson(long id){
        if(IDPeople.containsKey(id))
            return IDPeople.get(id);
        else return null;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<Person> getPeople() {
        return People;
    }

}
