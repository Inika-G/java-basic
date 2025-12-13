import java.util.*;
public class mainq17 
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println(a > 0 && (a & (a - 1)) == 0);
    }
    
}
