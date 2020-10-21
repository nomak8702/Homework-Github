package curs12.exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Costel Pop", 25, "black"));
        listPerson.add(new Person("Dombo Kalman", 45, "red"));
        listPerson.add(new Person("Vegvari Marius", 40, "grey"));
        listPerson.add(new Person("Szabo Timea", 36, "blonde"));
        listPerson.add(new Person("Maria Ioana", 30, "caramel"));
        listPerson.add(new Person("Costel Pop", 25, "black"));

        List<String> names = new ArrayList<>();
        for (Person result : listPerson) {
            names.add(result.getName());
        }

        MapPersons mapPersons=new MapPersons();
        for(Person result:listPerson){
            mapPersons.addPerson(result);
        }
        System.out.println(mapPersons.getPersonToAge(29));









    }
}
