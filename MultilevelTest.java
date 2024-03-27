class parent{
    void Display(){
        System.out.println("This is parent calss");
    }
}
class child extends parent{
    void Display(){
        System.out.println("This is child class");
    }
}

class childchild extends child{
    void Display(){
        System.out.println("This is chilchild class in java");
    }
}


public class MultilevelTest {
    public static void main(String[] args) {
        childchild chch=new childchild();
        chch.Display();
        child c=new child();
        c.Display();
        parent p=new parent();
        p.Display();
    }
    
}
