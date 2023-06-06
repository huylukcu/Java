package day14_arraysforeachloop;

public class Arrays {
    public static void main(String[] args) {

       // Example 1:
       // [0, 2, 3, 0 ,12 ,0] put the zeros end /////INTERWIEV QA
        //[2, 3, 12, 0, 0, 0]

        int arr[] = {0, 2, 3, 0, 12, 0};

        int brr[] = new int[arr.length];

        int idx = 0;

        for(int i =0; i<arr.length; i++){

            if(arr[i] != 0 ){

                brr[idx] = arr[i];

                idx++;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(brr));

        //Example 2: Type code to check if a specific element exists in an array or not
        //        int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[] = { -12, 23, 5};

        int counter = 0;
        int element = 23;




    }
}
