import java.util.*;

public class CHardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int first = Math.min(a, m);
            int second = Math.min(b, m);
            int remaining = 2 * m - (first + second);
            int third = Math.min(c, remaining);
            int ans = first + second + third;
            System.out.println(ans);
        }
    }
}