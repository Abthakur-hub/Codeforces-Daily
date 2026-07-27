import java.util.*;

public class ADestroyingTowers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                min = Math.min(min, x);
                ans += min;
            }

            System.out.println(ans);
        }
    }
}