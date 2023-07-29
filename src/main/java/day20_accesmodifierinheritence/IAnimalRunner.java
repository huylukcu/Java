package day20_accesmodifierinheritence;

public class IAnimalRunner {
    public static void main(String[] args) {

        //Create a "Cat" object and see which methods can be used

        ICat c = new ICat();                              //bold olan methodlar intelliJ den geliyor
        c.meow();
        c.drink();
        c.eat();

        //Create a "Dog" object and see which methods can be use

        IDog d = new IDog();
        d.bark();
        d.drink();
        d.eat();

        //Create a "Bird" object and see which methods can be used

        IBird b = new IBird();
        b.tweet();
        b.drink();
        b.eat();

        IAnimal a = new IAnimal();   //create an object from Animal class


        /*
        1)We use "inheritance";
          i)to prevent "repetition"
          ii)to make "maintenance" easy
          iii)to make our classes"atomic"

        2)To make a class child of another class we use "extends" keyword

        3)Child classes can use class members from the parent classes.
          However, parent classes can not use anything from the child classes

        4)Every class except "Object Class" in Java has at least one parent class which is "Object Class"

        5)Inheritance Type in Java
           1)Multilevel Inheritance
           2)Hierarchical Inheritance
           3)Multiple Inheritance(Jva does not support it)

      */



    }
}
