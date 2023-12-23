import java.util.Scanner;

public class SeasonsIf {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input <= 2 && input >= 12) {
            System.out.println("Winter");
        } else if(input >= 3 && input <= 5) {
            System.out.println("Spring");
        } else if(input >= 6 && input <= 8) {
            System.out.println("Summer");
        } else if(input >= 9 && input <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid value");
        }
    }
}
