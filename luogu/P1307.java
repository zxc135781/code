import java.util.Scanner;

public class P1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        boolean c = true;
        while (c) {
            b = b * 10 + a % 10;
            a /= 10;
            if (a == 0) {
                c=false;
            }
        }
        System.out.println(b);
    }
}
