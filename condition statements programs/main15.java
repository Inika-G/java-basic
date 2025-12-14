import java.util.*;
public class main15
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%3==0)
            System.out.print("divisible by 3");
        else if(a%7==0)
            System.out.print("Divisible by 7");
        else
            System.out.print("not divisible by both 3 and 7"); 
    }
    
}
