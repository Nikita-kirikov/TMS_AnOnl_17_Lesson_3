import java.util.Scanner;
public class SeasonsSwitch {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
            switch(input) {
                case 1, 11, 12:
                    System.out.println("Winter");
                    break;
                case 2, 3, 4:
                    System.out.println("Spring");
                    break;
                case 5, 6, 7:
                    System.out.println("Summer");
                    break;
                case 8, 9, 10:
                    System.out.println("Autumn");
                    break;
                    default:
                        System.out.println("Must be positive num up to 12 ");
            }
    }
}
