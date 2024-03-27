//super to call parent class constructor in java 
class parent {
    int num1;
    parent(){
        System.out.println("Parent class constructor");
        num1=10;

    }

    parent(int data){
      System.out.println("Parent parametrized constructor"+data);
      num1=data;
      System.out.println(num1);
    }
}

class child extends parent{
    int num2;
    child(){
        super(100);
        System.out.println("inside child class constructor"+num2);
        num2=200;
        System.out.println(num2);

    }
}

public class supertoparentclass {
    public static void main(String[] args) {
        child ch=new child();

    }
}
