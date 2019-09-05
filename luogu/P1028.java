import java.util.Scanner;

public class P1028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] ints = new int[1001];
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j/2; k++) {
                ints[j] += ints[k];
            }
            ints[j]++;
        }
        System.out.println(ints[i]);
    }
}
