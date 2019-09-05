import java.util.Scanner;

public class P2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    for (int l = 1; l <= 3; l++) {
                        for (int m = 1; m <= 3; m++) {
                            for (int n = 1; n <= 3; n++) {
                                for (int o = 1; o <= 3; o++) {
                                    for (int p = 1; p <= 3; p++) {
                                        for (int q = 1; q <= 3; q++) {
                                            for (int r = 1; r <= 3; r++) {
                                                if ((i + j + k + l + m + n + o + p + q + r) == a) {
                                                    x++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(x);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    for (int l = 1; l <= 3; l++) {
                        for (int m = 1; m <= 3; m++) {
                            for (int n = 1; n <= 3; n++) {
                                for (int o = 1; o <= 3; o++) {
                                    for (int p = 1; p <= 3; p++) {
                                        for (int q = 1; q <= 3; q++) {
                                            for (int r = 1; r <= 3; r++) {
                                                if ((i + j + k + l + m + n + o + p + q + r) == a) {
                                                    System.out.println(i+ " " + j + " " + k + " " + l + " "+ m + " "+ n + " "+ o + " "+ p + " "+ q + " "+ r);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
