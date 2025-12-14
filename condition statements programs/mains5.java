import java.util.*;
public class mains5 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
         int choice=sc.nextInt();
        double balance=1000;
        switch(choice)
        {
            case 1:
                System.out.println(balance);
                break;
            case 2:
                int deposit=sc.nextInt();
                System.out.print(balance+deposit);
                break;
            case 3:
                int withdraw=sc.nextInt();
                if(balance>0 && withdraw<=balance)
                    System.out.print(balance-withdraw);
                else
                    System.out.print("balance not efficient"); 
                    break;
            default :
                    System.out.print("Invalid option");
                    break;
                              
        }


    }
    
}
