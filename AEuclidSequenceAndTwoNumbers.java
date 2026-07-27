import java.util.*;

public class AEuclidSequenceAndTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);

            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
            }

            boolean f = true;

            for (int i = 2; i < n; i++) {
                if (a[i] != a[i - 2] % a[i - 1]) {
                    f = false;
                    break;
                }
            }

            System.out.println(f ? a[0] + " " + a[1] : -1);
        }
    }
}