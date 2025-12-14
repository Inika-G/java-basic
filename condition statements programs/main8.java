import java.util.*;
public class main8 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int c=a/10;
        if(c%3==0)
            System.out.print("divisible by 3");
        else
            System.out.print("Not divisible by 3");

    } 
    
}
