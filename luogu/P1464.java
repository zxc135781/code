import java.util.Scanner;

public class P1464 {
    static long[][][] rpt = new long[25][25][25];

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        while (true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1) {break;}
            System.out.print("w("+a+","+" "+b+","+" "+c+") =");
            if (a > 20) a = 21;
            if (b > 20) b = 21;
            if (c > 20) c = 21;
            System.out.println(" "+w(a,b,c));
        }

    }

    public static long w(long a, long b, long c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (rpt[(int) a][(int) b][(int) c] != 0) return rpt[(int) a][(int) b][(int) c];
        else if (a > 20 || b > 20 || c > 20) rpt[(int) a][(int) b][(int) c] = w(20, 20, 20);
        else if (a < b && b < c) rpt[(int) a][(int) b][(int) c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        else
            rpt[(int) a][(int) b][(int) c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        return rpt[(int) a][(int) b][(int) c];
    }
}