import java.util.Scanner;

public class P1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] x = new int[10];
        x[0] = 0;
        int t = 0;
        for (int i = 1; i < 987; i++) {
            if (i * a <= 987) {
                x[a * i % 10]++;
                x[a * i / 10 % 10]++;
                x[a * i / 100]++;
            }
            if (i * b <= 987) {
                x[b * i % 10]++;
                x[b * i / 10 % 10]++;
                x[b * i / 100]++;
            }
            if (i * c <= 987) {
                x[c * i % 10]++;
                x[c * i / 10 % 10]++;
                x[c * i / 100]++;
            }
            for (int j = 1; j <= 9; j++) {
                if (x[j] == 0) {
                    break;
                }
                if (x[0] > 0) {
                    x[0] = 0;
                    break;
                }
                if(j>=9)
                {
                    System.out.println(a*i+" "+b*i+" "+c*i);
                    t=1;
                }
            }
            for (int j = 0; j <= 9; j++) {
                x[j]=0;
            }
        }
        if (t == 0) {
            System.out.println("No!!!");
        }
    }
}
