import java.util.*;
public class sb5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double fev=sc.nextDouble();
        if(fev<=97)
            System.out.print("No fever");
        else if(fev>=98 && fev<=100)
            System.out.print("lite fever");
        else
            System.out.print("high fever");
    }
    
}
