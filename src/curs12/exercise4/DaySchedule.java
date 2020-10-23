package curs12.exercise4;

public class DaySchedule {
    private final String activities;
    private final DaysOfWeek days;

    public DaySchedule(String activities, DaysOfWeek days) {
        this.activities = activities;
        this.days = days;
    }

    public String getActivities() {
        return activities;
    }

    public DaysOfWeek getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activities='" + activities + '\'' +
                ", days=" + days +
                '}';
    }
}
