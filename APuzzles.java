import java.util.*;

public class APuzzles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i=0; i<m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int mn = Integer.MAX_VALUE;
        for (int i=0; i+n-1<m; i++) {
            mn = Math.min(mn, a[i+n-1] - a[i]);
        }
        System.out.println(mn);
    }
}