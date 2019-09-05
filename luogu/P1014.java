import java.util.Scanner;

public class P1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int sum = 0;
        int sx = 0;
        int c = 0;
        int fm = 0;
        while (a > sum) {
            sum += b;
            b++;
        }
        int fz = b;
        c = sum - a;
        fm = fm + c+1;
        fz = fz - c-1;
        if (b % 2 == 0) {
            System.out.println(fm + "/" + fz);
        } else {
            System.out.println(fz + "/" + fm);
        }
    }
}
