import java.util.*;

public class CHugePile {

    static int ans;

    static void dfs(long x, long k, int steps) {
        if (x == k) {
            ans = Math.min(ans, steps);
            return;
        }
        if (x < k) return;
        if (steps >= ans) return;

        long a = x / 2;
        long b = (x + 1) / 2;

        dfs(a, k, steps + 1);
        dfs(b, k, steps + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            ans = Integer.MAX_VALUE;

            dfs(n, k, 0);

            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }
}