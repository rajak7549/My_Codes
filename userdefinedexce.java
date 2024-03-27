import java.util.Scanner;

class  ExceptionPrint extends Exception
{
    public ExceptionPrint(String message)
    {
        super(message);
    }
}
public class userdefinedexce {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age ");
        int age=sc.nextInt();
        
        try{
          if(age<0) {
                throw new ExceptionPrint("not be elligible");
          }
          System.out.println("Congrates you are eligible for vote "+age );
         }
         catch(ExceptionPrint e){
            System.out.println(" Problem information is : "+e.getMessage());
         }
    }
    
}