import java.util.*;
public class main16 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a%2==0 && a%5==0 && a%8!=0)
            System.out.print("divisible by both 2 and 5 but not by 8");
        else
            System.out.print("not satisfied condition");
    }   
}
