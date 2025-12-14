import java.util.*;
public class sb13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bat=sc.nextDouble();
        if(bat<=40)
            System.out.print("Low");
        else if(bat>40 && bat<=75)
            System.out.print("moderate");
        else if(bat>75 && bat<=100)
            System.out.print("full");
        else
            System.out.print("invalid");
    }    
}    
