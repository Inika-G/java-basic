import java.util.*;
public class main13
 {
    public static void main(String[] args)
    {
        int l,w,h;
        Scanner v=new Scanner(System.in);
        l=v.nextInt();
        w=v.nextInt();
        h=v.nextInt();
        int s=2*((l*w)+(w*h)+(h*l));
        int vol=l*w*h;
        System.out.print(s+"\n"+vol);
    }
}