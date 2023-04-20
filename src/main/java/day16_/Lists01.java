package day16_;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //How to create a List(ArrayList)

        //1.Way:
        ArrayList<Integer> myList1 = new ArrayList<Integer>();        //Integer is wrapper class

        //2.Way:
        ArrayList<Integer> myList2 = new ArrayList<Integer>();

        //3.Way:
        List<Integer> myList3 = new ArrayList<Integer>();      //useful this way

        //How to print a list on the console
        System.out.println(myList3);

        //How to add elements into a list
        myList3.add(12);   //[12]           //add() method puts the elements in insertion order
        myList3.add(7);   //[12, 7]

        System.out.println(myList3); //12

        myList3.add(1,50);    //50 yi eklemek istiyoruz add()list method,hangi index e koymak istiyorsun
        System.out.println(myList3);         //[12, 50, 7]

        myList3.add(3,99);
        System.out.println(myList3);         //[12,50,7,99]

        //How to join two lists
        List<String> a = new ArrayList<String>();
        a.add("A");
        a.add("B");

        List<String> b = new ArrayList<String>();
        b.add("X");
        b.add("Y");
        b.add("Z");
                                                //addAll method bir listeyi al digerinin icine ekle
        a.addAll(b);                            //addAll(b) ====> b listenin sonunda kalir
        System.out.println(a);//[A,B,X,Y,Z]
        System.out.println(b);//[X,Y,Z]         //list b degismedi, list a  degisti

        a.addAll(1, b);
        System.out.println(a);//[A,X,Y,Z,B,X,Y,Z]                  // 1.inx e tekrar b ekle


        //How to get the number of elements in a List

        int sizeOfA = a.size();
        System.out.println(sizeOfA);  //8                         //size() method kac tane number var listede onu verir

        int sizeOfB = b.size();
        System.out.println(sizeOfB);


        //Note: When you talk about the number of the elements in Array use "Length of the array",for the lists use "size of the list"

       //Example 1: Type code to check if the given list is empty or not?

        List<Character> c = new ArrayList<>();




    }
}
