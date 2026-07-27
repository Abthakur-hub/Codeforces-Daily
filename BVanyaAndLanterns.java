import java.util.*;

public class BVanyaAndLanterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = sc.nextInt();

        Arrays.sort(v);

        double ans = 0;

        for (int i = 1; i < n; i++)
            ans = Math.max(ans, (v[i] - v[i - 1]) / 2.0);

        ans = Math.max(ans, v[0]);
        ans = Math.max(ans, l - v[n - 1]);

        System.out.printf("%.10f%n", ans);
    }
}