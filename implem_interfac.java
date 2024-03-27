interface human{
    void run();
}
interface abuse extends human{
    void abusing();
}
class impleinterall implements abuse{
    public void run(){
        System.out.println("He is running ");
    }
    public void abusing(){
        System.out.println("He ia abusing me very badly");
    }
}
public class implem_interfac {
    public static void main(String[] args) {
        impleinterall im=new impleinterall();
        im.run();
        im.abusing();
    }
}
