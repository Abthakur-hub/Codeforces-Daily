import java.util.*;

public class ACourseWishes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[k + 1];
            for (int i=1; i<=k; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int i=0; i<n; i++) {
                b[i] = sc.nextInt();
            }
            ArrayList<Integer> v = new ArrayList<>();
            for (int x=k; x>=1; x--) {
                for (int i=0; i<n; i++) {
                    if (b[i] == x) {
                        while (b[i] <= k) {
                            v.add(i + 1);
                            b[i]++;
                        }
                    }
                }
            }
            System.out.println(v.size());
            for (int x : v) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}