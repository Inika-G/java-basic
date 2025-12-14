import java.util.*;
public class mains1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        int cal=sc.nextInt();
        switch(cal)
        {
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            case 4:
                System.out.print(a/b);
                break;
            case 5:
                System.out.print(a%b);
                break; 
            default :
                System.out.print("Invalid number");
                break;
         }
        
    } 
}
