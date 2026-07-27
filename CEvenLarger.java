import java.util.*;

public class CEvenLarger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            long ans = 0;

            if (v[0] > v[1]) {
                ans += v[0] - v[1];
                v[0] = v[1];
            }

            for (int i = 2; i < n; i += 2) {
                long d = v[i - 1] - v[i - 2];

                if (i < n - 1) {
                    d = Math.min(d, v[i + 1]);
                }

                if (v[i] > d) {
                    ans += v[i] - d;
                    v[i] = d;
                }
            }

            System.out.println(ans);
        }
    }
}