import java.util.*;
public class sb2 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int age=sc.nextInt();
       if(age>=18)
        System.out.print("Eligible to vote");
       else
        System.out.print("not eligible to vote");  
    } 
}
