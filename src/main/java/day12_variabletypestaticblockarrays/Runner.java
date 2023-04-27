package day12_variabletypestaticblockarrays;

public class Runner {
    public static void main(String[] args) {

        //To access a non-static variable from the class, you have to create object

        VariableTypes01 obj = new VariableTypes01();     //create an object
        System.out.println(obj.name);   //Tom Hanks

        //actually you can access to static class members by using objects, it is not recommended
        System.out.println(obj.age); //do not ude this type

        //To access a static variable no need to create object, just class name is enough

        System.out.println(VariableTypes01.age);   //13

        System.out.println(obj.add(3,6));

        System.out.println(obj.multiply(4,8));

    }

}
