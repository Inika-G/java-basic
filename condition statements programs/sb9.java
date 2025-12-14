import java.util.*;
public class sb9 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int balance=2000;
        int withdraw=sc.nextInt();
         if (withdraw <= balance && withdraw % 100 == 0) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal Failed");
        }
    }   
}
