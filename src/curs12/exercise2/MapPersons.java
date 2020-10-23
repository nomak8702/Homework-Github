package curs12.exercise2;

import java.util.*;

public class MapPersons {
    private List<Person> persons = new ArrayList<>();

    public MapPersons(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> getNamePersons() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<Integer, String> getNameToAge() {
        Map<Integer, String> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getAge(), person.getName());
        }
        return result;
    }

    public Map<Integer, String> getOlderPerson(int age) {
        Map<Integer, String> result = new HashMap<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                result.put(person.getAge(), person.getName());
            }
        }
        return result;
    }

    public Map<String, List<String>> getHairColourToPersons() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> names = result.get(person.getHaircolour());
            if (names == null) {
                names = new ArrayList<>();
                result.put(person.getHaircolour(), names);
            }
            names.add(person.getName());
        }
        return result;
    }

    public Map<Integer, List<String>> getAgeToPersons() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> names = result.get(person.getAge());
            if (names == null) {
                names = new ArrayList<>();
                result.put(person.getAge(), names);
            }
            names.add(person.getName());
        }
        return result;
    }
}


