import java.util.*;
public class main17 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int b=s.nextInt();
        int c=a%10;
        int d=b%10;
       if(c==d)
        System.out.print("two numbers have the same last digit");
       else
        System.out.print("two numbers not have the same last digit");
    }
    
}
