import java.util.Scanner;

public class sb7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();

        int perPerson = candies / people;
        int remaining = candies % people;

        System.out.println("Candies per person: " + perPerson);
        System.out.println("Remaining candies: " + remaining);
    }   
}
