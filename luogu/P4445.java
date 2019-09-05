import java.util.Scanner;

import static java.lang.Math.max;

public class P4445 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[100001];
        long ans = 0;
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 1; i < a; i++) {
            ans+=max(b[i],b[i-1]);
        }
        System.out.println(ans);
    }
}
