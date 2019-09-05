import java.util.Scanner;

public class P1579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 2; i < a - 4; i++) {
            for (int j = 2; j < a - 4; j++) {
                x = a - i - j;
                if (zs(i) && zs(j) && zs(x)) {
                    if (i <= j && j <= x && x >= 0) {
                        System.out.println(i + " " + j + " " + x);
                        y=1;
                        break;
                    }
                }
            }
            if (y == 1) {
                break;
            }
        }
    }

    public static boolean zs(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
