package day05_ternarystringmanipulations;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        /*
        ask user to enter country name among "America, Englnad
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter");
        char userletter = input.next().toUpperCase().charAt(0);

        switch (userletter) {
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("State");
                break;
            case 'A':
                System.out.println("America");
                break;
                default:
                    System.out.println("invalid letter");

        }

    }
}
