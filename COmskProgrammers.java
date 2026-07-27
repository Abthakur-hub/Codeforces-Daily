import java.util.*;

public class COmskProgrammers{

    static long x;
    static HashMap<Long, Long> memo;

    static long solve(long a, long b) {
        if (a == b) return 0;

        long key = (a << 32) ^ b;
        if (memo.containsKey(key))
            return memo.get(key);

        long ans = Math.abs(a - b);

        long addA = (x - a % x) % x;
        ans = Math.min(ans, addA + 1 + solve((a + addA) / x, b));

        long addB = (x - b % x) % x;
        ans = Math.min(ans, addB + 1 + solve(a, (b + addB) / x));

        memo.put(key, ans);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            x = sc.nextLong();

            memo = new HashMap<>();

            System.out.println(solve(a, b));
        }
    }
}