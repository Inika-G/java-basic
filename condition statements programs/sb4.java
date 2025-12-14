import java.util.*;
public class sb4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bat=sc.nextDouble();
        if(bat<=40)
            System.out.print("Low Battery");
        else if(bat>40 && bat<=75)
            System.out.print("50% consumed");
        else if(bat>75 && bat<=100)
            System.out.print("battery full");
        else
            System.out.print("invalid");
    }    
}