import java.util.*;
public class mainq12
{
    public static void main(String[] args)
    {
        double a;
        Scanner s= new Scanner(System.in);
        a=s.nextDouble();
        double b=(a*a)/a;
        b=b<0? -b:b;
        System.out.print(b);
    }
    
}
