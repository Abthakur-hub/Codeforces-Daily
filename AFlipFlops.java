import java.util.*;

public class AFlipFlops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long f = sc.nextLong();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            for (long x : arr) {
                if (x <= c) {
                    long add = Math.min(c - x, f);
                    f -= add;
                    c += x + add;
                }
            }

            System.out.println(c);
        }
    }
}