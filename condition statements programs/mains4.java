import java.util.*;
public class mains4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print("weekday");
                break;
            case 6:
            case 7:
                System.out.print("weekend");
                break;
            default :
                System.out.print("Invalid input");
                break;                        
        }
    }
} 

