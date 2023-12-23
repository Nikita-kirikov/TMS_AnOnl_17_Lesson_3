import java.util.Scanner;
public class Temperature {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t > -5 ) {
            System.out.println("Warm");
        } else if(-5 >= t && t > -20) {
            System.out.println("Normal");
        } else if(-20 >= t) {
            System.out.println("Cold");
        }
    }
}
