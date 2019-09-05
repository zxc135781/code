import java.util.Scanner;

public class P1554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int[] c = new int[10];
        int e = Integer.parseInt(a);
        for (int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++) {
            char[] d = a.toCharArray();
            for (int i1 = 0; i1 < d.length; i1++) {
                c[Character.getNumericValue(d[i1])]++;
            }
            e++;
            a = String.valueOf(e);
        }
        for (int i = 0; i < c.length-1; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println(c[c.length-1]);
    }
}
