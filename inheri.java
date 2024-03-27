//Singleinheritance in java .
class sum{
    int a;
    int b;
    void Display(int a,int b){

        this.a=a;
       this.b=b;
    }
}
       class Createchild extends sum{
        void Display(){
            System.out.println("The value of  a is " + a + " and the value of b is " + b );
        }
    }

public class inheri {
    public static void main(String[] args) {
        Createchild ch=new Createchild();
        ch.Display(10, 20);
        ch.Display();
    }
    
}
