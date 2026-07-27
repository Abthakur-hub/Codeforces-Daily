import java.util.*;

public class BOffshores{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long tr = sc.nextLong();
            long cr = sc.nextLong();
            long[] a = new long[n];
            long total = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
                total += a[i] / tr;
            }
            long ans = 0;
            for (long x : a) {
                ans = Math.max(ans, x + (total - x / tr) * cr);
            }
            System.out.println(ans);
        }
    }
}