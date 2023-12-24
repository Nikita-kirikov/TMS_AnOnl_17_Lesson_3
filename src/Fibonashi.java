public class Fibonashi {
    public static void Run() {
        int nextNum = 0;
        int prevNum = 1;
        for(int i =0; i < 11; i++) {
            nextNum = prevNum - nextNum;
            prevNum = prevNum + nextNum;
            System.out.println(nextNum);
        }
    }
}
