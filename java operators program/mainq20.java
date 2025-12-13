import java.util.Scanner;

public class mainq20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        // using only operator (ternary)
        System.out.println(marks >= 40 ? "Pass" : "Fail");
    }
}
