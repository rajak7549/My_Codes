import java.util.Scanner;

public class excepttest {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter two  number ");
        System.out.println("Enter first number ");
        num1=sc.nextInt();
        System.out.println("Enter second number ");
        num2=sc.nextInt();

       try{
        if(num2==0)
             
           throw new ArithmeticException();
            result=num1/num2;
           System.out.println(result);
       }catch(ArithmeticException exception){
           System.out.println("Problem is "+exception);
       }finally{
        System.out.println("Finally block is executed ");
       }

       System.out.println("Program is end");
       
    }
}
