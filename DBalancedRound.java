import java.util.*;

public class DBalancedRound{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];

            for(int i=0; i<n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int cur = 1, mx = 1;

            for(int i=1; i<n; i++) {
                if(a[i] - a[i - 1] <= k) {
                    cur++;
                } else {
                    mx = Math.max(mx, cur);
                    cur = 1;
                }
            }

            mx = Math.max(mx, cur);

            System.out.println(n - mx);
        }
    }
}