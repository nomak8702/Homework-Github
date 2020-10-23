package curs12.exercise4;

import java.util.HashMap;
import java.util.Map;

public class MainDaysActivities {
    public static void main(String[] args) {
        Map<String,DaysOfWeek> activities= new HashMap<>();
        activities.put("Football",DaysOfWeek.MONDAY);
        activities.put("Baschet",DaysOfWeek.TUESDAY);
        activities.put("XBOX",DaysOfWeek.WEDNESDAY);
        activities.put("Read Book",DaysOfWeek.THURSDAY);
        activities.put("Learnig Java",DaysOfWeek.FRIDAY);
        activities.put("Homework java",DaysOfWeek.SATURDAY);
        activities.put("Relax",DaysOfWeek.SUNDAY);

        for(Map.Entry<String,DaysOfWeek> result:activities.entrySet()){
            System.out.println(result.getKey()+"-"+result.getValue());
        }
    }
}
