import java.util.Scanner;

public class sb10 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;

        double totalSalary = basic + hra + da;
        System.out.println(totalSalary);
    }   
}
