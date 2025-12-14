import java.util.*;
public class maing5 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a+b>c || b+c>a || a+c>b)
            System.out.println("three sides form a valid triangle.");
        else
            System.out.print("three sides not form a valid triangle.");
    }
    
}
