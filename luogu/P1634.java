import java.util.Scanner;

public class P1634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long he=1;
        long js=1;
        for (int i = 0; i < b; i++) {
            he = js*a+he;
            js = he;
        }
        System.out.println(he);
    }
}
