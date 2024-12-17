import java.util.Scanner;
public class InputExample{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        String name=in.next();
        System.out.println("enter  anumber");
        int answer=in.nextInt();
        
        System.out.println("enter the address");
        String result=in.next();
        System.out.println("enter the  name"+name);
        System.out.println("enter the  number "+answer );
        System.out.println("enter the address"+result);
    }
}