import java.util.Scanner;

public class P1036 {
    static int n=0;
    static int k=0;
    private static int ans;
    private static int[] a = new int[25];
    private static boolean[] c = new boolean[25];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        k=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        dfs(0,0,0);
        System.out.println(ans);
    }
    // 提取素数
    public static boolean ss(int a) {
        for (int i = 2; i*i <=a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int m, int sum, int i) {
        if (m == k) {
            if (ss(sum)) {
                ans++;
            }
            return;
        }
        for (int j = i; j < n; j++) {
            if (c[j]) {
                continue;
            }
            c[j]=true;
            dfs(m+1,sum+a[j],j+1);
            c[j]=false;
        }
        return;
    }
}
