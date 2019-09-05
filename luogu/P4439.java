import java.util.Scanner;

public class P4439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        int c = 1;
        for (int i = 0; i < a-1; i++) {
            String d = scanner.next();
            if (!d.equals(b)) {
                c += 1;
                b = d;
            }
        }
        System.out.println(c+1);
    }
}
