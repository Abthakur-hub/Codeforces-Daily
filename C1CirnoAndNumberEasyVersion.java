import java.util.*;

public class C1CirnoAndNumberEasyVersion {

    static long result;
    static long a;
    static int x,y;

    static void solve(long num, int len) {
        if (len > 18) return;
        if (len > 0) {
            result = Math.min(result, Math.abs(a - num));
        }
        solve(num*10+x, len+1);
        solve(num*10+y, len+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            a = sc.nextLong();
            int n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            result = Long.MAX_VALUE;

            if (x != 0) solve(x, 1);
            if (y != 0) solve(y, 1);

            if (x == 0 || y == 0) {
                result = Math.min(result, a);
            }
            System.out.println(result);
        }
    }
}