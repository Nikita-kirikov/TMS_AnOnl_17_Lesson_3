import java.text.MessageFormat;
public class MultiplicationTable {
    public static void Run() {
        for(int i = 1; i <= 10; i++) {
            System.out.print(MessageFormat.format("\n Multiply at {0} ---", i));
            for(int j = 1; j <= 10; j++) {
                System.out.print("\t" + i*j);
            }

        }
    }
}
