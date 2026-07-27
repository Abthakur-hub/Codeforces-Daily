import java.util.*;

public class AAnotherPopcountProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = 0;

            long value = 1;

            while (value <= n) {
                long take = Math.min(k, n / value);

                ans += take;
                n -= take * value;

                value *= 2;
            }

            System.out.println(ans);
        }
    }
}