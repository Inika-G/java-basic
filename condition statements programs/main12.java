import java.util.*;
public class main12
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int c=a%10;
        if(c%2==0)
           System.out.print("Even");
        else
            System.out.print("Odd");
    }   
}

