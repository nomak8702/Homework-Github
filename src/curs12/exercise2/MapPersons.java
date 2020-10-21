package curs12.exercise2;

import java.util.HashMap;
import java.util.Map;

public class MapPersons {
    private final Map<String, Integer> mapperson = new HashMap<>();

    public void addPerson(Person person) {
        mapperson.put(person.getName(), person.getAge());
    }

    public Map<String, Integer> getPersonToAge(int age) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> person : mapperson.entrySet()) {
            if (person.getValue() > age) {
                result.put(person.getKey(), person.getValue());
            }
        }
        return result;
    }


}


