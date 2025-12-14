import java.util.Scanner;
public class main6 
{
     public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b && a>c)
            System.out.print(a);
        else if(b>a && b>c)
            System.out.print(b);
        else
            System.out.print(c);
    } 
}
