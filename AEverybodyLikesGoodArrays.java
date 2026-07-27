import java.util.*;

public class AEverybodyLikesGoodArrays{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            int i = 0, ans = 0;
            while (i < n) {
                int c = 0, p = a[i] % 2;
                while (i < n && a[i] % 2 == p) {
                    c++;
                    i++;
                }
                ans += c - 1;
            }
            System.out.println(ans);
        }
    }
}
