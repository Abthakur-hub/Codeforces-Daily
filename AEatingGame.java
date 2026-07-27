import java.util.*;

public class AEatingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int max = 0;
            int count = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
            }
            for (int x : a) {
                if (x == max) count++;
            }
            System.out.println(count);
        }
    }
}