import java.util.*;
public class sb7 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        if(ele<=100)
            System.out.print("free!! no electricity bill");
        else if(ele>100 && ele<=300)
            System.out.print(ele*5);
        else if(ele>300 && ele<500)
            System.out.print(ele*10);
        else
        {
            double surcharge=ele*0.10;
            System.out.print(surcharge);
        }
    }
    
}
