package day08_stringmanipulationloops;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy. Java is OOP";

        String result1 = str.replaceFirst("Java","Apex");

        System.out.println(result1);

        /*

        String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.

        */

        String shirtPrice = "$12.99";
        String bookPrice =  "$35.99";

        String shirt = shirtPrice.replace("$","");
        System.out.println(shirt);

        String book = bookPrice.replace("$","");
        System.out.println(book);


        //ValueOf() method converts String data type to numeric data type
        //Note: to be able to use valueOf() method, String must be in numeric format
        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println("total price " + (shirtInDouble+bookInDouble));

         /*
             Example 2: Swap the integers
             a=12  b=23 ===> a=23   b=12
          */
         int a = 12; int b = 23;














    }
}
