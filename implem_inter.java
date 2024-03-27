interface human{
    void song();
    void walk();
}

interface woman{
    void fight();
    void makup();
}
class fashion implements human,woman{
   public  void song(){
        System.err.println("Man is singing");
    }
    public void walk(){
        System.err.println("Man is walking");
    }
   public  void fight(){
        System.out.println("He is fighting");

    }
    public void makup(){
        System.out.println("She is makuping his face");

    }
}



public class implem_inter {
    public static void main(String[] args) {
        fashion f=new fashion();

        f.song();
        f.walk();
        f.fight();
        f.makup();
    }
    
}
