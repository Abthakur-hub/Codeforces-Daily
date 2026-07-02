import java.util.*;

public class AAnotherPuzzleFromPapyrus{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();


            long ans = Long.MAX_VALUE;

            long cost1 = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {

                if (a[i] < b[i]) {
                    possible = false;
                    break;
                }

                cost1 += a[i] - b[i];
            }

            if (possible)
                ans = Math.min(ans, cost1);

            Arrays.sort(a);
            Arrays.sort(b);

            long cost2 = c;
            possible = true;

            for (int i = 0; i < n; i++) {

                if (a[i] < b[i]) {
                    possible = false;
                    break;
                }

                cost2 += a[i] - b[i];
            }

            if (possible)
                ans = Math.min(ans, cost2);

            System.out.println(ans == Long.MAX_VALUE ? -1 : ans);
        }
    }
}