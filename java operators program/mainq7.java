import java.util.*;
public class mainq7
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}        

        