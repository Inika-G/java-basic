import java.util.*;
public class main9
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if((a&1)==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }   
}
