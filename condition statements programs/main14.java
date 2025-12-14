import java.util.*;
public class main14 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a%3==0 && a%5==0)
            System.out.print("divisible by both 3 and 5");
        else
            System.out.print("Not divisible by both 3 nad 5");
    }
    
}
