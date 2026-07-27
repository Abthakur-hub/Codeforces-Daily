import java.util.*;

public class AIncreasingSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int x = 0;

            for (int v : a) {
                int y = x + 1;

                if (y == v) y++;

                x = y;
            }

            System.out.println(x);
        }
    }
}