package day08_stringmanipulationloops;

public class MyWork {
    public static void main(String[] args) {

        for (int i = 11; i < 44; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Ex
        for (int i = 68; i > 12; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //4.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i = 11; i < 45; i++) {
            System.out.print(i + " ");
        }
        //6.Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11
        // in the same line with a space between consecutive integers

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println("--------------------------");

        ///reversed the name
        String name = "saidA";
        String reversedName = "";

        for (int i = name.length() - 1; i>=0; i--) {

            char ch = name.charAt(i);

            reversedName = reversedName + ch;

        }
            System.out.print(reversedName);

    }
}









