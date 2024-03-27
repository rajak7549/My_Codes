//this is the exaple of super refer to parent class method in java.
class parent {
    int data=10;

    void Display(){
        System.out.println("This is parent calss ");
        System.out.println("value of a is "+data);
    }
}


class child extends parent{
    int data=30;
    void Display(){
        System.out.println("This is child class");
        System.out.println("The value of data is "+data);
        System.out.println("This is parent class data "+super.data);

        super.Display();
    }
}
public class superparent {
    public static void main(String[] args) {
        child child=new child();
        child.Display();
    }
}
