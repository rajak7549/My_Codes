class parent {
    int s;
    void setdata(int s){
      this.s=s;
    }
}

class child extends parent{
      void showdata(){
        System.out.println("THis is child calss ");
        System.out.println("The value of a is "+s);
      }
}

class childchild extends parent{
    void Display(){
       System.out.println("THis is child child class");
       System.out.println("The vale of s is"+s); 
    }
}
public class Hierarchical {
    public static void main(String[] args) {
    child c=new child();
    c.setdata(20);
    c.showdata();
    childchild ch=new childchild();
    ch.setdata(60);
    ch.Display();
    }
}
