import java.util.Scanner;

public class P1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 10000;
        int z = 0;
        int flge=0;
        for (int i = y; i <= 30000; i++) {
            z = i/10%1000;
            if (i / 100 % x == 0 &&z%x==0&&i%1000%x==0) {
                System.out.println(i);
                flge++;
            }
        }
        if (flge == 0) {
            System.out.println("No");
        }
    }
}
