import java.util.*;
public class maing2 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if ((a * a == b * b + c * c) ||
            (b * b == a * a + c * c) ||
            (c * c == a * a + b * b)) {

            System.out.println("Right-angled triangle");
        } else {
            System.out.println("Not a right-angled triangle");
        }

    }
    
}
