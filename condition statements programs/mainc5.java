import java.util.*;
public class mainc5 
{
    public static void main(String[]  args)
    {
        char a,b;
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        b=s.next().charAt(0);
        if(a==b)
            System.out.print("character equal");
        else 
            System.out.print("character not equal");
    }
}    

