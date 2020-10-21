package curs12.exercise1;

import java.util.*;


public class Exercise1 {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();
        student.put("Costel Geroge", 8);
        student.put("Marian Chelaru", 7);
        student.put("Bob Adrian", 9);
        student.put("Csabi Szabo", 8);

        for (Map.Entry<String, Integer> result : student.entrySet()) {
            System.out.println(result.getKey() + " - " + result.getValue());
        }

        Map<String, Integer> highGrade = new HashMap<>();
        List<Integer> grades = new ArrayList<>();

        for (Map.Entry<String, Integer> result : student.entrySet()) {
            if (result.getValue() > 0) {
                grades.add(result.getValue());
            }
        }

        for (Map.Entry<String, Integer> result : student.entrySet()) {
            if (result.getValue() == Collections.max(grades)) {
                highGrade.put(result.getKey(), result.getValue());
            }
        }
        System.out.println("------------");
        for (Map.Entry<String, Integer> result : highGrade.entrySet()) {
            System.out.println(result.getKey() + " - " + result.getValue());
        }
    }
}
