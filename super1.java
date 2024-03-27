//This is example of super keyword in java.
class parent{
    int data=10;

}

class child extends parent{

    int data = 20;
    void sowdisplay(){
        System.out.println("In the  parent calss");
        System.out.println("Child class num  is " + data);
        System.out.println("Parent calss num is "+super.data);
    }
}
public class super1 {
   public static void main(String[] args) {
        child child=new child();
        child.sowdisplay();

        System.out.println("Inside the non child class ");
       System.out.println("non child class data member "+child.data);
   } 
}
