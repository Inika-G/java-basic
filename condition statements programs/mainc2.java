import java.util.*;
public class mainc2 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.print("uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.print("lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.print("digit");
        }
        else{
            System.out.print("special symbol");
        }

    }
    
}
