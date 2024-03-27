import java.util.Vector;

public class vectorSimple {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);

        v.addElement(8000);


        System.out.println(v.isEmpty());
        System.out.println(v.lastIndexOf(60));
        System.out.println(v.size());
        System.err.println(v.contains(20));
        System.out.println(v.capacity());
        //System.out.println(v.remove(50));


        for(Object o:v){
            System.out.println("Vector elemnet is "+o);

        }
    }
}
