import java.util.*;

public class BMaximumMultipleSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 2;
            int maxSum = 0;

            for (int x = 2; x <= n; x++) {
                int k = n / x;

                int sum = x * (k * (k + 1) / 2);

                if (sum > maxSum) {
                    maxSum = sum;
                    ans = x;
                }
            }

            System.out.println(ans);
        }
    }
}