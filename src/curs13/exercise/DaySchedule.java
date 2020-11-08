package curs13.exercise;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private final List<String> activities;
    private final WeekDays day;


    public DaySchedule(WeekDays day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public WeekDays getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }
}