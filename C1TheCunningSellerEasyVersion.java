import java.util.*;

public class C1TheCunningSellerEasyVersion {

    static long[] pow3 = new long[39];

    static long c(int x) {
        if (x == 0) return 3;
        return pow3[x + 1] + (long) x * pow3[x - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pow3[0] = 1;
        for (int i = 1; i < 39; i++) {
            pow3[i] = pow3[i - 1] * 3;
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;

            while (n > 0) {
                int x = 0;

                while (x + 1 < 39 && pow3[x + 1] <= n) {
                    x++;
                }

                ans += c(x);
                n -= pow3[x];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}