import java.util.*;

public class G1TeleportersEasyVersion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] p = new long[n];

            for (int i = 0; i < n; i++) {

                long val = sc.nextLong();

                p[i] = val + (i + 1);
            }

            Arrays.sort(p);

            long sum = 0;
            long ans = 0;

            for (long x : p) {

                if (sum + x <= c) {
                    sum += x;
                    ans++;
                } else {
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}