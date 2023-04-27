package day12_variabletypestaticblockarrays;

public class VariableTypes01 {

    //name is "non-static" or "object" or "instance" variable
    public String name = "Tom Hanks";

    //age is "static" or "class" variable
    public static int age = 13;                     //use static before return type

    //local variable
    //Note: If the return type is different from "void", you have to use "return" keyword inside the method
    public int add(int a, int b) {
        return a + b;
    }

    //Create a method to do multiplication
    public int multiply(int x,int y){           //access modifier + return type + method name(){
             return x*y;                        //           return + statement}
        }
    }

