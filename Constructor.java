//Constructor in Java
package javaapplication2;
import java.util.Scanner;
class Constructor_Test{
   private
           int id;
           double gpa;
           String name;

    // Normal Method
    void print(int a, int b, int c){
        System.out.println(a+ " "+b+" "+c);
    }
    //Constructor without parameter
    Constructor_Test(){
        id  = 10;
        gpa = 3.11;
        name = "Mahbubur Rahman Chowdhury";
        System.out.println("ID = " +id+ ", GPA = "+gpa+ ", Name  = "+name);
    }
    //Constructor with parameter
    Constructor_Test(int id,double gpa, String name){
        System.out.println("ID = " +id+ " GPA = "+gpa+ " Name  = "+name);
    }
}
public class demo{
    public static void main(String[] args) {
       // Constructor will automatically called when object is created
        Constructor_Test objwp = new Constructor_Test();
        Constructor_Test obj = new Constructor_Test(8,3.11,"Mamunur Rahman Chowdhury");
    }
}
