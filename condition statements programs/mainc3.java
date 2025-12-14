import java.util.*;
public class mainc3 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            System.out.println("Alphabet");
        else
            System.out.print("Not Alphabet");
    }
}
