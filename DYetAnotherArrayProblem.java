import java.util.*;

public class DYetAnotherArrayProblem {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long g = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                g = gcd(g, x);
            }

            long ans = -1;

            for (long x = 2; x <= 100; x++) { 
                if (gcd(x, g) == 1) {
                    ans = x;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}