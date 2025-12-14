import java.util.*;
public class maing1 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==b&&b==c)
            System.out.print("Equilateral");
        else if(a==b || b==c ||a==c)
            System.out.print("isosceles");
        else
            System.out.print("Scalene");

    }
    
}
