import java.util.*;
public class main13 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a==0)
            System.out.print("Zero");
        else if(a>0)
            System.out.print("Positive");
        else
            System.out.print("Negative");
    }
}
