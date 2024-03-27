import java.util.StringTokenizer;

public class StringToke {
    public static void main(String[] args) {
        String str="This is the example of String tokenizer";
        String str2="Welcome to String tokenizer";

        StringTokenizer st=new StringTokenizer(str);
        StringTokenizer st1=new StringTokenizer(str2);

        System.out.println("Tokens in the Str1");
        while(st.hasMoreTokens()){
            System.out.println("First string Element is :"+st.nextToken());
        }

        System.out.println("Tokens for String2");
        while (st1.hasMoreTokens()) {
            System.out.println("Now printing Second String : "+st1.nextToken());
        }
    }
}
