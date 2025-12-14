import java.util.*;
public class mainy5 {
    public static void main(String[] args)
    {
        int m,y;
        Scanner s=new Scanner(System.in);
        y=s.nextInt();
        m=s.nextInt();
        boolean leap=(y%400==0 || y%4==0 && y%100!=0);
    
            if(m>=1 && m<=12)
            {
                if(m==1||m==3||m==5||m==7||m==8||m==12||m==10)
                {
                   System.out.print("31 days"); 
                }
                else if(m==4||m==6||m==9||m==11)
                {
                    System.out.print("30 days");
                }
                else{
                    if(leap)
                        System.out.print(" 29 days");
                    else
                        System.out.print("28 days");
                }
            }
           
        
    }
    
}
