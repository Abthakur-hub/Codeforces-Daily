import java.util.*;

public class ACarnivalWheel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                x = (x + y) % n;
                ans = Math.max(ans, x);
            }

            System.out.println(ans);
        }
    }
}