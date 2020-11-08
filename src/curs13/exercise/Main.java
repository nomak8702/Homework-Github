package curs13.exercise;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoActivitiesForDayException {

        DayPlanner dayPlanner=new DayPlanner();
        Scanner scanner=new Scanner(System.in);
        int input=0;

      do {
          System.out.print("Please choose an option: " + "\n" + "\n" + "1) add an activity" +
                  "\n" + "\n" + "2) remove an activity" + "\n" + "\n" + "3) list all activities" + "\n" + "\n" + "4) end planning");

          System.out.println();

           input = scanner.nextInt();
          System.out.println("If use selects " + input + ")" + " prompt:");

          if (input == 1) {
              System.out.print("day: ");
              WeekDays day = WeekDays.valueOf(scanner.next());
              System.out.println();
              System.out.print("activity: ");
              String activity = scanner.next();
              dayPlanner.addActivity(day, activity);
          } else if (input == 2) {
              System.out.print("day: ");
              WeekDays day = WeekDays.valueOf(scanner.next());
              System.out.println();
              System.out.print("activity: ");
              String activity = scanner.next();
              dayPlanner.removeActivity(day, activity);
          } else if (input == 3) {
              System.out.println(dayPlanner.listActivities());
          } else if (input == 4) {
              System.out.print("day: ");
              WeekDays day = WeekDays.valueOf(scanner.next());
              System.out.println();
              System.out.println(dayPlanner.endPlannig(day));
          } else {
              System.out.println("Your choose is fail !!");
          }
      } while(input!=0);

        System.out.println("You exit the DayScheduler");


    }
}
