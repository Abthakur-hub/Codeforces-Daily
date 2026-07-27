import java.util.*;

public class ENegativesAndPositives{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long sum = 0;
            int negatives = 0;
            long minAbs = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                long x = sc.nextLong();

                if (x < 0)
                    negatives++;

                sum += Math.abs(x);

                minAbs = Math.min(minAbs, Math.abs(x));
            }

            if (negatives % 2 == 1) {
                sum -= 2 * minAbs;
            }

            System.out.println(sum);
        }
    }
}