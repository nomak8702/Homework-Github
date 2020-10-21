package curs12.exercise2;

public class Person {
    private final String name;
    private final int age;
    private final String haircolour;

    public Person(String name, int age, String haircolour) {
        this.name = name;
        this.age = age;
        this.haircolour = haircolour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHaircolour() {
        return haircolour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haircolor='" + haircolour + '\'' +
                '}';
    }
}
