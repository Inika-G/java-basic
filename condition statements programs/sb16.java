import java.util.*;
public class sb16 {
    public static void main(String[] agrs)
    {
       Scanner sc=new Scanner(System.in);
       int mn=sc.nextInt();
       int count=0;
       while(mn!=0)
       {
        count++;
        mn=mn/10;
       }
       if(count==10)
       {
        System.out.print("valid number");
       }
       else 
       {
        System.out.print("Invalid number");
       }
    }
    
}
