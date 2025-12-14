import java.util.*;
public class mainy1
 {
public static void main(String[] args)
{
    int y;
    Scanner sc=new Scanner(System.in);
    y=sc.nextInt();
    if(y%400==0 || y%4==0 )
        System.out.print("leap year");
    else
        System.out.print("not a laep year");
}
    
}
