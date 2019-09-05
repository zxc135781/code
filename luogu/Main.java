import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String[] b = sc.nextLine().split(" ");
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i].toLowerCase().equals(a)) {
                c = i;
                d++;
            }
        }
        for (int i = 0; i < c; i++) {
            e = e + b[i].length() + 1;
        }
        if (d > 0) {
            System.out.println(d + " " + c);
        } else {
            System.out.println(-1);
        }

    }
}