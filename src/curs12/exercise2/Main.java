package curs12.exercise2;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MapPersons mapPersons = new MapPersons(List.of(
                new Person("Carol Zsigmond", 65, "black"),
                new Person("Maria Ioan", 27, "brown"),
                new Person("Raymond Andrei", 40, "red"),
                new Person("Pall Misi", 30, "black"),
                new Person("George Marius", 30, "brown"),
                new Person("Costel Pop", 27, "brown"),
                new Person("Szabo Timea", 30, "red")
        ));
        System.out.println(mapPersons.getNamePersons());
        System.out.println(mapPersons.getNameToAge());
        System.out.println(mapPersons.getOlderPerson(29));
        System.out.println(mapPersons.getHairColourToPersons());
        System.out.println(mapPersons.getAgeToPersons());

    }
}
