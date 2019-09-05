import java.util.Scanner;

public class P1888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        long max = 0;
        long min = 1000000000;
        long yuefen = 0;
        for (int i = 0; i < 3; i++) {
            a = scanner.nextInt();
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }
        for (long i = max; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                yuefen = i;
                break;
            }
        }
        System.out.println(min/yuefen+"/"+max/yuefen);
    }
}
