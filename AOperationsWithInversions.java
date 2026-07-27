import java.util.*;

public class AOperationsWithInversions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i=0; i<n; i++) {
                v[i] = sc.nextInt();
            }
            int m = 0;
            int k = 0;
            for (int x : v) {
                if (x>=m) {
                    k++;
                    m = x;
                }
            }
            System.out.println(n - k);
        }
    }
}