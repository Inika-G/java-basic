import java.util.*;
public class maing6 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a==b && b==c&& c==d)
            System.out.print("Square");
        else if(a==c && b==d || a==b && c==d)
            System.out.print("rectangle");
        else
            System.out.print("Not both square and rectangle");

    }
}
