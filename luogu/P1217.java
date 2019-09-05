import java.util.Scanner;

public class P1217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (sx(i)) {
                if (hw(i)) {
                    System.out.print(i+",");
                }
            }
            if (i % 2 == 1) {
                i++;
            }
        }
    }

    public static boolean sx(int x) {
        int c = (int) Math.sqrt(x);
        for (int i = 2; i <= c; i++) {
            if (x % i==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean hw(int x) {
        String d = String.valueOf(x);
        int l=0;
        int h=d.length()-1;
        while (l < h) {
            if (d.charAt(l) != d.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
