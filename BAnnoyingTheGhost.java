import java.io.*;
import java.util.*;

public class BAnnoyingTheGhost{

    static final long INF = (long) 4e18;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                a[i] = Integer.parseInt(st.nextToken());

            int[] b = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                b[i] = Integer.parseInt(st.nextToken());

            boolean ok = true;

            for (int i = 1; i <= n; i++) {
                boolean found = false;
                for (int j = 1; j <= n; j++) {
                    if (b[j] >= a[i]) {
                        found = true;
                        break;
                    }
                }
                if (!found) ok = false;
            }

            if (!ok) {
                System.out.println(-1);
                continue;
            }

            long[][] dp = new long[n + 1][n + 1];

            for (int i = 0; i <= n; i++)
                Arrays.fill(dp[i], INF);

            for (int j = 0; j <= n; j++)
                dp[0][j] = 0;

            for (int i = 1; i <= n; i++) {

                long best = INF;

                for (int j = 1; j <= n; j++) {

                    if (b[j] >= a[i]) {

                        if (best != INF)
                            dp[i][j] = best + (j - i);

                    }

                    if (dp[i - 1][j] != INF)
                        best = Math.min(best, dp[i - 1][j]);
                }
            }

            long ans = INF;

            for (int j = 1; j <= n; j++)
                ans = Math.min(ans, dp[n][j]);

            if (ans == INF)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
    }
}