import java.util.Scanner;

public class P1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(sc.nextLine());
        }
        char[] b = sb.toString().toCharArray();
        int[] c = new int[26];
        int d = 0;
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 65 && b[i] <= 90) {
                c[b[i] - 65]++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (max < c[i]) {
                max = c[i];
            }
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < 25; j++) {
                if (c[j] >= i) {
                    for (int k = j; k < 26; k++) {
                        if (c[k] >= i) {
                            d = k;
                        }
                    }
                    if (j == d) {
                        System.out.print("*");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    for (int k = j; k < 26; k++) {
                        if (c[k] >= i) {
                            d = k;
                        }
                    }
                    if (j < d) {
                        System.out.print("  ");
                    } else {
                        break;
                    }
                }
            }
            if (c[25] >= i) {
                System.out.println("*");
            } else {
                System.out.println();
            }
        }
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
}