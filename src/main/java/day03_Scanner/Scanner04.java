package day03_Scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your middle name");
        String middleName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your SSN");
        String ssn = input.next();

        System.out.println(firstName + " " +middleName+ " " + lastName );
        System.out.println(ssn);








    }





}
