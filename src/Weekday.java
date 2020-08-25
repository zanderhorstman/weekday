import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int day;

        System.out.println("Enter today's weekday number: ");
        day = input.nextInt();

        if (day == 1) {
            System.out.println("Today is Sunday.");
        } else if (day == 2) {
            System.out.println("Today is Monday");
        } else if (day == 3) {
            System.out.println("Today is Tuesday.");
        } else if (day == 4) {
            System.out.println("Today is Wednesday.");
        } else if (day == 5) {
            System.out.println("Today is Thursday.");
        } else if (day == 6) {
            System.out.println("Today is Friday.");
        } else {
            System.out.println("Today is Saturday.");
        }
    }
}
