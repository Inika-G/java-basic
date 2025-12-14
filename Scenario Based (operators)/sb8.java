import java.util.Scanner;

public class sb8
{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trays = sc.nextInt();
        int cakesPerTray = sc.nextInt();

        int totalCakes = trays * cakesPerTray;

        System.out.println(totalCakes);
    }
 
}
