import java.util.*;

public class BAnotherSortingProblem {
    static long ans = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextLong();
            }
            long[][] dp = new long[2][2];
            dp[0][0] = 1;
            dp[0][1] = ans;
            dp[1][0] = 1;
            dp[1][1] = ans;
            for (int p=0; p<n-1; p++) {
                long[][] ndp = new long[2][2];
                for (int j=0; j<2; j++) {
                    ndp[j][0] = ans;
                    ndp[j][1] = -1;
                }
                for (int i=0; i<2; i++) {
                    long l = dp[i][0];
                    long r = dp[i][1];
                    if (l>r) continue;
                    for (int j=0; j<2; j++) {
                        long ln = l;
                        long rn = r;
                        if (i==j) {
                            if (arr[p]>arr[p + 1]) continue;
                        }
                        else if (i==0 && j==1) {
                            ln = Math.max(ln,arr[p]-arr[p+1]);
                        }
                        else {
                            rn = Math.min(rn,arr[p+1]-arr[p]);
                        }
                        if (ln>rn) continue;
                        ndp[j][0] = Math.min(ndp[j][0],ln);
                        ndp[j][1] = Math.max(ndp[j][1],rn);
                    }
                }
                dp = ndp;
            }
            boolean flag = false;
            for (int i=0; i<2; i++) {
                if (dp[i][0]<=dp[i][1]) {
                    flag = true;
                }
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}