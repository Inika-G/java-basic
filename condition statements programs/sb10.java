import java.util.*;
public class sb10 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.equals("red"))
            System.out.print("Stop");
        else if(str.equals("yellow"))
            System.out.print("Ready");
        else if(str.equals("green"))
            System.out.print("Go");
        else
            System.out.print("invail color");
    }  
}
