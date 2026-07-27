import java.util.*;

public class CGridCovering {
    static int solve(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int g1 = solve(n, a);
            int g2 = solve(m, b);
            int g3 = solve(n, m);
            if (g1 == 1 && g2 == 1 && g3 <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}