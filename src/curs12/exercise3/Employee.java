package curs12.exercise3;

import curs12.exercise2.Person;

public class Employee extends Person {
    public final String company;
    public final int salary;

    public Employee(String name, int age, String haircolour, String company, int salary) {
        super(name, age, haircolour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
