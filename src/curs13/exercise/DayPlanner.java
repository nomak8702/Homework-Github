package curs13.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayPlanner {

    private final List<DaySchedule> daySchedulers = new ArrayList<>();

    public List<DaySchedule> getDaySchedulers() {
        return new ArrayList<>(daySchedulers);
    }

    public void addActivity(WeekDays day, String activity) {
        boolean find = false;
        for (DaySchedule daySchedule : daySchedulers) {
            if (daySchedule.getDay().equals(day)) {
                daySchedule.addActivity(activity);
                find = true;
            }
        }
        if (!find) {
            DaySchedule daySchedule = new DaySchedule(day);
            daySchedule.addActivity(activity);
            daySchedulers.add(daySchedule);
        }

    }

    public void removeActivity(WeekDays day, String activity) {
        boolean find = false;
        for (DaySchedule schedule : daySchedulers) {
            if (schedule.getDay().equals(day) && schedule.getActivities().contains(activity)) {
                schedule.removeActivity(activity);
                find = true;
            } else {
                throw new ActivityException("Activity " + activity + "doesn't exists!");
            }
        }
        if (!find) {
            throw new ActivityException("No scheduler for day " + day);
        }

    }

    public List<String> getActivities(WeekDays day) {
        List<String> result = new ArrayList<>();

        for (DaySchedule daySchedule : daySchedulers) {
            if (daySchedule.getDay().equals(day)) {
                result.add(String.valueOf(daySchedule.getActivities()));
            }
        }
        return result;
    }

    public Map<WeekDays, List<String>> endPlannig(WeekDays day) throws NoActivitiesForDayException {

        Map<WeekDays, List<String>> result = new HashMap<>();
        List<String> activities = new ArrayList<>();
        for (DaySchedule daySchedule : daySchedulers) {
            activities = result.get(daySchedule.getDay());
            if (activities == null && daySchedule.getDay().equals(day)) {
                activities = new ArrayList<>();
                result.put(daySchedule.getDay(), activities);
                activities.add(String.valueOf(daySchedule.getActivities()));
            }
        }
        return result;
    }
}
