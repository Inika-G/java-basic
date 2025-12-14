import java.util.*;
public class mainc4 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       char ch=s.next().charAt(0);
       if(ch>='0' && ch<='9')
        System.out.print("digit");
       else
        System.out.print("Not digit"); 
    }
    
}
