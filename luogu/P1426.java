import java.math.BigDecimal;
import java.util.Scanner;

public class P1426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigDecimal x = new BigDecimal(7);
        BigDecimal s = new BigDecimal(0);
        while (a - b > s.floatValue()) {
            s = s.add(x);
            x = x.multiply(BigDecimal.valueOf(0.98));
        }
        if (x.floatValue() <= (a + b) - s.floatValue()) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }

    }
}
