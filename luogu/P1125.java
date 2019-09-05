import java.util.Scanner;

import static java.lang.Math.sqrt;

public class P1125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[] b = a.toCharArray();
        int[] c =new int[26];
        int max = 0;
        int min = 999;
        int flag = 0;
        for (int i = 0; i < b.length; i++) {
            c[b[i]-'`']++;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
            if (c[i] < min) {
                if (c[i] == 0) {
                    continue;
                }
                min = c[i];
            }
        }
        for (int i = 2; i < sqrt(max-min); i++) {
            if ((max - min)%i==0) {
                flag = 1;
            }
        }
        if (max - min==1||max - min ==0) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("No Answer");
            System.out.println("0");
        } else {
            System.out.println("Lucky Word");
            System.out.println(max-min);
        }
    }
}
