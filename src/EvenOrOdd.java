import java.util.Scanner;
public class EvenOrOdd {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
