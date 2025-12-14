import java.util.Scanner;

public class sb15 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        System.out.println(amt / 500);
        amt %= 500;

        System.out.println(amt / 100);
    }
}
