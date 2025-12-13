import java.util.*;
public class mainq6 
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    
}
