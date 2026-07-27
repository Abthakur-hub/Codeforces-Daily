import java.util.*;

public class ANewYearTransportation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 1;
        while (pos < t) {
            pos = pos + a[pos];
        }
        if (pos == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}