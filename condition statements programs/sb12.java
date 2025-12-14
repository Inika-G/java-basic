import java.util.*;
public class sb12 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double we=sc.nextDouble();
        if(we<=45)
            System.out.print("cold");
        else if(we>45 && we<=80)
            System.out.print("pleasant");
        else if(we>80 && we<=100)
            System.out.print("hot");
        else 
            System.out.print("heatwave");

    }
}

