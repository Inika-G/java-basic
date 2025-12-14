import java.util.*;
public class mainy2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(y%100==0)
            System.out.print("century year");
        else 
            System.out.print("not century year");
    }
    
}
