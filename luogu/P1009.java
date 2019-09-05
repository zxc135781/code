import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger("0");
        BigInteger c = new BigInteger("1");
        BigInteger d = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        String x = "";
        for (int i = 1; i <= Integer.parseInt(String.valueOf(a)); i++) {
            c = BigInteger.valueOf(i);
            for (int j = 0; j < i; j++) {
                d = d.multiply(c);
                c = c.subtract(BigInteger.valueOf(1));
                if (Integer.parseInt(String.valueOf(c)) == 0) {
                    break;
                }
            }
            sum = sum.add(d);
            d = BigInteger.valueOf(1);
        }
        System.out.println(sum);
    }
}