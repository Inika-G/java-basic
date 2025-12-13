import java.util.*;
public class main5
{
    public static void main(String[] args)
    {
        int x1,y1,x2,y2;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
        y1=s.nextInt();
        x2=s.nextInt();
        y2=s.nextInt();
        int dx=x2-x1;
        int dy=y2-y1;
        int dis=(dx*dx)+(dy+dy);
        System.out.println(dis*dis);
    }
}