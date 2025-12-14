import java.util.*;
public class sb8 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        int atm_pin=2311;
        if(pin==atm_pin)
            System.out.print("you are allow to wirthdraw now!!");
        else
            System.out.print("pin not matched!! you can't withdraw");
    }  
}
