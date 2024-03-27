public class final_var {
    public static void main(String[] args) {
       final  int data=10;
        System.out.println("final data is "+data);
        //data=200;//it will give an erroe java.lang.error because lacal variable is final it cannot be modified
        try {
           // data=100;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
