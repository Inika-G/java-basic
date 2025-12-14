import java.util.*;
public class sb1
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       double bill=sc.nextDouble();
       double dis=sc.nextDouble();
       if(bill>8000)
        System.out.print(bill-(dis/100));
       else if(bill>5000)
        System.out.print(bill-(dis/100));
       else if(bill>2500)
        System.out.print(bill-(dis/100));
       else
        System.out.print("Sorry! No discount for you");
    } 
}
