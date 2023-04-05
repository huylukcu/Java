package day03_Scanner;

public class IfStatement01 {


    public static void main(String[] args) {

        //If statement: We sometimes need to execute some codes under some specific conditions
        //If it rains, I will cancel the picnic

        //Example 1: Type code to print "negative" for the numbers less than zero, "non-negative" for the numbers greater than or equal to zero.


        double d = -2.3;

        if (d < 0) {
            System.out.println("Negative");
        }
        if (d >= 0) {
            System.out.println("Non-negative");

        }

        //example 2:Type code to print "divisible by 5" if the number can be divided by 5, otherwise print " non divisible by 5".


        int i = 1503;
        //1.Way : multiple if condition

        if (i % 5 == 0) {
            System.out.println("divisible by 5");

        }
        if (i % 5 != 0) {
            System.out.println("non divisible by 5");    //!= means "NOT" in the java
        }


        //2.Way: if else condition


        int k = 15;
        if (k % 5 == 0) {
            System.out.println("divisible by 5");
        } else {
            System.out.println("non divisible by 5");


        }


    }
}