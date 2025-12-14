import java.util.*;
public class mainy4 {
    public static void main(String[] args)
    {

        int y1,y2;
        Scanner sc=new Scanner(System.in);
        y1=sc.nextInt();
        y2=sc.nextInt();
        int a=y1%10;
        int b=y2%10;
        if(a==b)
            System.out.print("same last digit");
        else
            System.out.print("last digit not same");
    }
}
