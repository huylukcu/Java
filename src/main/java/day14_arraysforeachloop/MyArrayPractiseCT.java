package day14_arraysforeachloop;

public class MyArrayPractiseCT {
    public static void main(String[] args) {

        //create an arrays numbers and assign 10 different numbers

        int numbers[] = {10, 5, 6, 23, 7, 100, 34, 45, 76, 90};

        //check if 10 points and say 10 points found

        if (numbers.length == 90) {
            System.out.println("10 points");
        } else {
            System.out.println("we need 10 points");
        }


        //Search in Array.Once you find 100 then exit the loop at that point, we are looking only first 100.
        //if that search value is not found print not exit

        int num[] = {25, 67, 35, 100, 39};

        int look = 100;

        int count = 0;

       /* for (int i = 0; i < num.length; i++) {

            if (num[i] == look) {

                System.out.println("The number is exit");
                break;
            }*/

             for(int w : num) {

                if (w == look) {

                    System.out.println("exit the 100");
                    break;
                }
                if(count<=0){
                    System.out.println("not exit");
                }
            }}
    }


