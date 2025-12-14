import java.util.*;
public class mains2 
{
    public static void main(String[] args)
    {
        int mark;
        Scanner sc=new Scanner(System.in);
        mark=sc.nextInt();
        switch(mark/10)
        {
            case 10:
            case 9:
            case 8:        
                    System.out.print("A");
                    break;
            case 7:
            case 6:   
                System.out.print("B");
                break;
            case 5:
            case 4:
                 System.out.print("C");
                 break;
            default :
                    System.out.print("Fail");    
        }
    }
    
}

