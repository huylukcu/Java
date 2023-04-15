package day03_Scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {


        // Example: Get the Width and the Length of a rectangle from the user
        //and get the area==> width*length

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width");

        double width = input.nextDouble();

        System.out.println("Enter the length");

        double lenght = input.nextDouble();

        System.out.println( "The area of the rectangle is : "+ width*lenght);

        System.out.println( "The are of the rectangle is :" + width);




    }











}
