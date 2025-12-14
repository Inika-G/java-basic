import java.util.*;
public interface main1 
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        if(a>b)
            System.out.print(a);
        else
            System.out.print(b);
    }
    
}
