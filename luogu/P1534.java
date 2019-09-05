import java.util.Scanner;

public class P1534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int cd = 0;
        int zt = 0;
        int he = 0;
        for (int i = 0; i < a; i++) {
            he =scanner.nextInt()+scanner.nextInt();
            zt = zt+he-8;
            cd = cd + zt;

        }
        System.out.println(cd);
    }
}
