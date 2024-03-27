class first{
    int data=10;
   final void display(){
        System.out.println("Final method data is  " + data);

    }
}

class second extends first{
   void show(){
    super.display();
    System.out.println("Fnal method cannot be oerride in java ");
    System.out.println("It can be call by super keyword");
   }
}
public class finalmethod {
    public static void main(String[] args) {
        second sc=new second();
        sc.display();
    }
}
