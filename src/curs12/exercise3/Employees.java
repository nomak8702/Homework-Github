package curs12.exercise3;

import java.util.*;

public class Employees {
    private List<Employee> persons = new ArrayList<>();

    public Employees(Collection<Employee> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Map<Integer, String> getPersonSalaryAmount(int salary) {
        Map<Integer, String> result = new HashMap<>();
        for (Employee employee : persons) {
            if (employee.getSalary() > salary) {
                result.put(employee.getSalary(), employee.getName());
            }
        }
        return result;
    }

    public Map<String, List<String>> getPersonsCompany() {
        Map<String, List<String>> result = new HashMap<>();
        for (Employee employee : persons) {
            List<String> names = result.get(employee.getCompany());
            if (names == null) {
                names = new ArrayList<>();
                result.put(employee.getCompany(), names);
            }
            names.add(employee.getName());
        }
        return result;
    }

    public int getAllSalaryPersons() {
        int sum = 0;
        for (Employee employee : persons) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Map<Integer, String> getCompanyBiggestSalary() {
        Map<Integer, String> result = new HashMap<>();
        List<Integer> salary = new ArrayList<>();
        for (Employee employee : persons) {
            salary.add(employee.getSalary());
            }
        for(Employee employee:persons) {
            if (employee.getSalary() == Collections.max(salary)) {
                result.put(employee.getSalary(), employee.getCompany());
            }
        }
        return result;
    }


}
