package day05_ternarystringmanipulations;


public class Ternary01 {

    // "Ternary" does the same with "if else"
    public static void main(String[] args) {

        // If an integer is positive print "The integer is positive" otherwise print "The integer is positive"

        int i = 12;


        // 1. Way


        if (i > 0) {
            System.out.println("The integer is positive");

        } else {
            System.out.println("The integer is not positive");
        }


        //2. Way


        // condition  ?  //if it is true             if it is false

        String result = i > 0 ? "The integer is positive" : "The integer is not positive";
        System.out.println(result);


        //Type a program to print the minimum of 2 doubles on the console
        //12, 23 ==> 12     345 , 23 ==>23     -12, -3 ==>-12


        double d = 1.2, e = 2.3;
        double min = d > e ? e : d;
        System.out.println(min);


        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //for negative numbers to find absolute value multiply the number by -1
        double f = -2.4;

        double abs = f >= 0 ? f : -1*f;

        System.out.println(abs);

        //Note:Instead of using" >=", you can use "<" this is better.

        double betterAbs = f<0 ? -1*f : f;

        System.out.println(betterAbs);




        /*you have two integers;
        if both of the integers are positive do multiplication.
        otherwise, return "I do not how to multiply.*/


        int a= 4, b=- 3;

        Object answer = a>0 && b>0 ? a*b : "I do not how to multiply";  //Burda object kullandik spring ve int bir arada oldugu icin "object" kullandik.

        System.out.println(answer);

    }
}




    

