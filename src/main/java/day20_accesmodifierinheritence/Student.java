package day20_accesmodifierinheritence;

public class Student {

    //INTERVIEW//

    //It is accessible from entire the project, there is no restriction
    public String stdName = "Tom Hank";

    //It can be used just inside the "Student" Class.
    //It can be used just inside the class it was created
    private String sdtId = "TH202217007";

    //Default access modifier is not reachable from outside the package but protected can
    //It can be used just inside the package "day20_accessmodifier" package
    //It can be used just inside the package it was created
    double stdGpa = 3.83;//If you do not type any access modifier it will be "default"

    //It can be used inside the package and from the child classes in other packages
    protected String stdAddres = "Miami, FL USA";

    //Following ones are "static", to access static things do not use "object",use class name
    public static String Name = "Tom Hank";
    private static String Id = "TH202217007";
    static double Gpa = 3.83;  //If you do not type any access modifier it will be "default"
    protected static String Address = "Miami, FL USA";
}


