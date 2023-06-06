package day08_stringmanipulationloops;

public class ForLoops02 {
    public static void main(String[] args) {

      //Ex.1: Put "*" between 2 consecutive characters and to the end in a String. for example; Java==>J*a*v*a*

        String str = "Java";

        for(int i =0; i<=str.length()-1; i++ ){     //i<length()

            System.out.print(str.charAt(i)+" *");
        }
        System.out.println();


        //Ex.2: Type code to print unique characters in a String.  Hello==>Heo

        String s = "Hello";

        for(int i = 0; i<s.length(); i++){

             if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){

                 System.out.print(s.charAt(i));
             }
         }

    }
}
