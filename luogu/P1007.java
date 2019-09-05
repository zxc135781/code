import java.util.Scanner;

public class P1007 {
    public static void main(String[] args) {
        int n, l, p, maxv = 0, minv = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt()+1;
        l = scanner.nextInt();
        for (int i = 0; i < l; i++) {
            p = scanner.nextInt();
            if (Math.abs(n - p) > p) {
                if (Math.abs(n - p) > maxv) {
                    maxv = Math.abs(n - p);
                }
                if (p > minv) {
                    minv = p;
                }
            } else {
                if (p > maxv) {
                    maxv = p;
                }
                if (Math.abs(n - p) > minv) {
                    minv = Math.abs(n - p);
                }
            }
        }
        System.out.println(minv+" "+maxv);
    }
}
