//Inner class (Class within Class) in Java
class Outer{
    private int a;         // This (a) variable is known to Inner Class
    void OuterMethod(){
        //Creating object of inner class
        Inner obj_inner =  new Inner();
        //Calling method of inner class
        obj_inner.InnerMethod();
        //Trying to access the member variable of inner class
        //System.out.println(iner); //wrong, because outer class can't access inner class member variable

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




public class Demo{
    public static void main(String[] args) {
        //Creation of object of Outer Class
        Outer obj_Outer = new Outer();
        //Trying to access the member method of inner class with the object of outer class
        //(wrong)obj_Outer.InnerMethod(); because Outer class can not refer to any member of inner class.
        //Inboking the Outer class method and this will inboke inner class method.
        obj_Outer.OuterMethod();
    }
}
