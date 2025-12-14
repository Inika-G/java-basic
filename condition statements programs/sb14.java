import java.util.*;
public class sb14 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<=5)
            System.out.print("no ticket for below age 5");
        else if(age>5 && age<=12)
            System.out.print("10rs");
        else 
            System.out.print("15rs");

    }
    
}
