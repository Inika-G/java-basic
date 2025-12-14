import java.util.*;
public class main20 
{
    public static void main(String[] args)
    {
        char ch;
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        if((int)ch%2==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
    
}
