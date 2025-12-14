import java.util.*;
public class mainy3 
{
    public static void main(String[] args)
    {
       int y;
       Scanner sc=new Scanner(System.in);
       y=sc.nextInt();
       int first=y%100;
       int last=y/100;
       if(first==last)
        {
            System.out.print("Equal");
        } 
        else{
            System.out.print("not equal");
        }
    }
    
}
