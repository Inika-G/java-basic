import java.util.Scanner;

public class sb19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total data (GB): ");
        double total = sc.nextDouble();

        System.out.print("Enter used data (GB): ");
        double used = sc.nextDouble();

        double percent = (used / total) * 100;

        if (percent < 50) {
            System.out.println("Low Data");
        }
        else if (percent == 50) {
            System.out.println("Half Consumed");
        }
        else if (percent > 100) {
            System.out.println("Data Over");
        }
        else {
            System.out.println("Data Available");
        }
    }
}




