import java.util.Scanner;

public class P3150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("pb wins");
            } else {
                System.out.println("zs wins");
            }
        }
    }
}
