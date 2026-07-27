import java.util.*;

public class BAdd0OrK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            if ((k & 1) == 1) {
                for (int i = 0; i < n; i++) {
                    if ((v[i] & 1) == 1) {
                        v[i] += k;
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    long r = v[i] % (k + 1);
                    v[i] += r * k;
                }
            }

            for (long x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}