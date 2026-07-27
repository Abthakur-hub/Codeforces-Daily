import java.util.*;

public class ITheEndians{

    static int n, k;
    static long[] w;
    static ArrayList<Integer>[] g;

    static long[][] dp;
    static int[] sz;

    static void dfs(int u, int p) {

        sz[u] = 1;
        dp[u][1] = w[u];

        for (int v : g[u]) {

            if (v == p) continue;

            dfs(v, u);

            long[] ndp = new long[k + 1];

            for (int i = 1; i <= Math.min(sz[u], k); i++) {

                for (int j = 1; j <= Math.min(sz[v], k - i); j++) {

                    ndp[i + j] = Math.max(
                            ndp[i + j],
                            dp[u][i] + dp[v][j] + (long)i * j * w[u]
                    );
                }
            }

            for (int i = 1; i <= Math.min(sz[u], k); i++) {
                ndp[i] = Math.max(ndp[i], dp[u][i]);
            }

            sz[u] += sz[v];

            for (int i = 1; i <= Math.min(sz[u], k); i++) {
                dp[u][i] = Math.max(dp[u][i], ndp[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            n = sc.nextInt();
            k = sc.nextInt();

            w = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                w[i] = sc.nextLong();
            }

            g = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                g[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {

                int u = sc.nextInt();
                int v = sc.nextInt();

                g[u].add(v);
                g[v].add(u);
            }

            for (int root = 1; root <= n; root++) {

                dp = new long[n + 1][k + 1];
                sz = new int[n + 1];

                dfs(root, 0);

                System.out.print(dp[root][k] + " ");
            }

            System.out.println();
        }
    }
}