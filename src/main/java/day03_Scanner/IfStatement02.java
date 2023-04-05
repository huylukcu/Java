package day03_Scanner;


import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


         /*

           Example 1: Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend days
           Monday - Friday ==> Weekday            Saturday, Sunday ==>Weekend day

        */

        Scanner input = new Scanner(System.in);

        System.out.println("enter a day name");

        String dayName = input.next();


        if (dayName.equals("Monday")) {

            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("wednesday")) {

            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {

            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")) {

            System.out.println("Weekend");
        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend");
        }


        //2. Way : if statement with or sign  ||


        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||

                dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("Thurs") || dayName.equalsIgnoreCase("Friday")) {

            System.out.println("weekday");

        } else if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday"))

            System.out.println("weekend");

        else {
            System.out.println("invalid dayName");
        }

    }
}








