import java.util.Scanner;

public class P1420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[1000];
        int d = 0;
        int max=-10000;
        for (int i = 1; i <= a; i++) {
            b[i]=scanner.nextInt();
        }
        for (int i = 1; i <= a; i++) {
            if (b[i + 1] - b[i] == 1) {
                d++;
            } else {
                d=0;
            }
            if (d > max) {
                max = d;
            }
        }
        System.out.print(++max);
    }
}
