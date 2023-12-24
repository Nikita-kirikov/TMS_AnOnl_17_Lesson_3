import java.util.Scanner;
public class Sum {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= input; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
