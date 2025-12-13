import java.util.Scanner;

public class mainq19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // using only operators (conditional operator)
        int greatest = (a > b && a > c) ? a : (b > c ? b : c);

        System.out.println(greatest);
    }
}
