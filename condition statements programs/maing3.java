import java.util.*;
public class maing3 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       if(x>0&&y>0)
        System.out.print("first quadreant");
       else if(x<0&&y>0)
        System.out.print("second quadrant");
        else if(x<0&&y<0)
            System.out.print("third quadrant");
        else if(x>0&&y<0)
            System.out.print("fourth quadrant");
        else if(x==0 && y==0)
            System.out.print("origin");
        else if(x==0)
            System.out.print("y-axis");
        else if(y==0)
            System.out.print("x-axis");

       

    }
    
}
