import java.util.*;
public class main5
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a>=100&&a<=999)
            System.out.print("3 digit number");
        else
            System.out.print("not 3 digit number");
    } 
}
