class mythread extends Thread{
    public void run(){
        System.out.println("Printing ten numbers using loop ");
        System.out.println("Thread is running ");
        for(int i=0;i<=10;i++){
            System.out.println("i = " + i);

        }
    }
}


public class threadSimple {
    public static void main(String[] args) {
        mythread th=new mythread();
        System.out.println("Now thread is starting");
        th.start();
    }
}
