package day04_IfElse_Switch;

import java.util.Scanner;

public class IfStatement01 {


    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age = input.nextByte();

        if(age<0) {
            System.out.println("invalid");

        }else if(age<=4){
            System.out.println("baby");

        }








    }




}
