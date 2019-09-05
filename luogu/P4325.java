import java.util.Scanner;

public class P4325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[1000];
        int b=0;
        for (int i = 0; i < 10; i++) {
            a[scanner.nextInt() % 42]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b++;
            }
        }
        System.out.println(b);
    }
}
