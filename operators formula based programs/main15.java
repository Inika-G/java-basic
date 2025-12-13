import java.util.*;
public class main15
 {
    public static void main(String[] args)
    {
        int r,h;
        Scanner v=new Scanner(System.in);
        r=v.nextInt();
        h=v.nextInt();
        Double pi=3.14;
        Double csa=2*pi*r*h;
        Double tb=2*pi*r*r;
        Double tsa=csa+tb;
        Double vol=pi*r*r*h;
        System.out.println(tsa+"\n"+vol);
    }
}
