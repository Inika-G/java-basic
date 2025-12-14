import java.util.Scanner;

public class sb14 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPens = sc.nextInt();
        int price = sc.nextInt();

        int freePens = (totalPens / 5) * 2;
        int paidPens = totalPens - freePens;

        int totalAmount = paidPens * price;
        System.out.println(totalAmount);
    }    
}
