class simple implements Runnable{
    public void run(){
        System.out.println("This is the example of runnable interface ");
        for(int i=0;i<=10;i++){
         System.out.println("i="+i);
        }
    }
}
public class thread2simple {
    public static void main(String[] args) {
        simple s=new simple();
        Thread th=new Thread(s);
        Thread th2=new Thread(s);
        th.start();
        th2.start();

    }
}
