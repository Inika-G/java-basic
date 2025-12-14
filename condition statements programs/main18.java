import java.util.*;
public class main18 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a/10==0)
            System.out.print("Single-digit");
        else if(a/100==0)
            System.out.print("Double-digit");
        else if(a/1000==0)
            System.out.print("three-digit");
        else
            System.out.print("more than three digit");
    }
    
}
