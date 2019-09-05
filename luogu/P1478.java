import java.util.Scanner;

public class P1478 {
    static int[] c= new int[5001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int j = 0;
        int js = 0;
        int js_max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (x[i]<=(a+b)) {
                if (y[i]<=s) {
                    c[j] = y[i];
                    j++;
                }
            }
        }
        for (int i = 0; i < j; i++) {
            for (int k = i+1; k < j; k++) {
                if (c[i] > c[k]) {
                    int p = c[i];
                    c[i] = c[k];
                    c[k] = p;
                }
            }
        }
        for (int i = 0; i < j; i++) {
            if (s >= c[i]) {
                s -= c[i];
                js++;
            }
        }
        System.out.println(js);
    }
}
