import java.util.Scanner;

abstract class  shape{
    int radius,length,breadth;

    Scanner sc=new Scanner(System.in);
    abstract void getArea();

}

class rectangle extends shape{
    void getArea(){
        System.out.println("Find the area of rectangle");
        System.out.println("ENter the length");
        length=sc.nextInt();
        System.out.println("Enter breadth");
        breadth=sc.nextInt();
        System.out.println("Area of rectangle is "+(length*breadth));
    }
}

class cirrcle extends shape{
    void getArea(){
       System.out.println("--------Area of circle--------");
       System.out.println("Enter the radius ");
       radius=sc.nextInt();
       System.out.println("Area of circle is " +3.14f*radius*radius);
    }
}

public class abstrcttest {
    public static void main(String[] args) {
        
        shape rectangle=new rectangle();
        rectangle.getArea();
        rectangle=new cirrcle();
        rectangle.getArea();
    }
    
}
