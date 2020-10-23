package curs12.exercise3;

import curs12.exercise2.Person;

import java.util.List;

public class MainEmployee {
    private static Object Person;

    public static void main(String[] args) {
        Employees employees= new Employees(List.of(
                new Employee("Carol Zsigmond", 65, "black","Faist",3500),
                new Employee("Maria Ioan", 27, "brown","Faist",3400),
                new Employee("Raymond Andrei", 40, "red","Plexus",3600),
                new Employee("Pall Misi", 30, "black","Plexus",3550),
                new Employee("George Marius", 30, "brown","Sma",3330),
                new Employee("Costel Pop", 27, "brown","Sma",3450),
                new Employee("Szabo Timea", 30, "red","Celestica",3200)
        ));

        System.out.println(employees.getPersonSalaryAmount(3550));
        System.out.println(employees.getPersonsCompany());
        System.out.println(employees.getAllSalaryPersons());
        System.out.println(employees.getCompanyBiggestSalary());
    }
}
