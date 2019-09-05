import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        int zt = 1;
        int dy = 1;
        long zm = 0;
        long cs = 0;
        int xs = 0;
        char wzs = 0;
        boolean r = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '-') {
                cs = xs * zt * dy + cs;
                xs = 0;
                zt = -1;
                r = false;
            }

            if (a[i] == '+') {
                cs = xs * zt * dy + cs;
                xs = 0;
                zt = 1;
                r = false;
            }

            if (a[i] == '=') {
                cs = xs * zt * dy + cs;
                xs = 0;
                zt = 1;
                dy = -1;
                r = false;

            }
            if (a[i] >= 'a' && a[i] <= 'z') {
                if (r) {
                    zm = xs * zt * dy + zm;
                    xs = 0;
                } else {
                    zm = zt * dy + zm;
                }
                wzs = a[i];
                r = false;
            }
            if (a[i] >= '0' && a[i] <= '9') {
                xs = xs * 10 + a[i] - '0';
                r = true;
            }
        }
        cs = xs * zt * dy + cs;
        BigDecimal fd = new BigDecimal(cs);
        fd = fd.divide(BigDecimal.valueOf(zm), 6, BigDecimal.ROUND_HALF_UP);
        DecimalFormat df = new DecimalFormat("0.000");
        float fds = 0;
        if (fd.floatValue() == 0) {
            fds = fd.floatValue();
        } else {
            fds = -fd.floatValue();
        }
        System.out.println(wzs + "=" + df.format(fds));
    }
}
