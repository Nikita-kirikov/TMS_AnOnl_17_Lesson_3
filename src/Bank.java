import java.util.Scanner;
public class Bank {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money");
        float money = scanner.nextFloat();

        System.out.println("Enter the number of months");
        float month = scanner.nextFloat();
        float percent = 0.07f;


        for(int i = 0; i < month; i++) {
            money += money * percent;
        }

        System.out.println(money);
    }
}
