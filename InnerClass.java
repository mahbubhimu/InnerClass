//Nested/Inner class in Java
package javaapplication2;
import java.util.Scanner;

class Outer{
    private int a;         // This (a) variable is known to Inner Class
    void OuterMethod(){
        //Creating object of inner class
        Inner obj_inner =  new Inner();
        //Calling method of inner class
        obj_inner.InnerMethod();
        //Trying to access the variable of inner class
        //System.out.println(iner); //wrong, because outer class can't access inner class variable

    }
    // Inner class definition
    class Inner{
        void InnerMethod(){
            //int iner=10;
            //Accessing outer class private variable
            System.out.println(a);
        }
    }
}
public class demo{
    public static void main(String[] args) {
        Outer obj = new Outer();
    }
}
