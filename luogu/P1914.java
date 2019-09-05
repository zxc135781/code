import java.util.Scanner;

public class P1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        char[] c = b.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if (a > 26) {
                a = a % 26;
            }
            char s = (char) (c[i] + a);
            if (s > 'z') {
                s = (char) (s - 26);
            }
            sb.append(s);
        }
        System.out.print(sb);
    }
}
