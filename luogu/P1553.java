import java.util.Scanner;

public class P1553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        char[] a = f.toCharArray();
        String b = "";
        long c = 0;
        String[] d;
        long e = 0;
        char[] g;
        int h = 0;
        long l = 0;
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] >= 48 && a[i] <= 57)) {
                b = String.valueOf(a[i]);
            }
        }
        if (b.equals("")) {
            for (int i = a.length - 1; i >= 0; i--) {
                e = Long.parseLong(sb.append(a[i]).toString());
            }
            System.out.println(e);
        } else if (!b.equals(".")) {
            d = f.split(b);
            sb.append(d[0]);
            e = Long.parseLong(sb.reverse().toString());
            if (b.equals("%")) {
                System.out.println(e + b);
            } else {
                sb1.append(d[1]);
                c = Long.parseLong(sb1.reverse().toString());
                System.out.println(e + b + c);
            }
        } else {
            g = f.toCharArray();
            for (int i = 0; i < g.length; i++) {
                if (g[i] != '.') {
                    sb.append(g[i]);
                } else {
                    break;
                }
            }
            for (int i = 0; i < g.length; i++) {
                if (g[i] == '.') {
                    h = i;
                }
            }
            for (int i = h + 1; i < g.length; i++) {
                sb1.append(g[i]);
            }
            e = Long.parseLong(sb.reverse().toString());
            l = Long.parseLong(sb1.toString());
            sb2.append(l).reverse();
            c = Long.parseLong(sb2.toString());
            System.out.println(e + b + c);
        }
    }
}
