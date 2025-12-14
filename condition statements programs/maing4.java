import java.util.*;
public class maing4{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=180;
        if(a+b+c==d && a>0 && b>0 && c>0 )
            System.out.print("valid triangle");
        else
            System.out.print("Not valid triangle");

    }
}

