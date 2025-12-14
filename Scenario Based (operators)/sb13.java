import java.util.Scanner;

public class sb13 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int price = sc.nextInt();
        int free = total / 4;
        int paidMangoes = total - free;
        int totalAmount = paidMangoes * price;
        System.out.println(totalAmount);
    } 
}
