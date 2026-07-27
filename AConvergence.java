import java.util.*;

public class AConvergence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans = n;
            int i = 0;
            while(i < n){
                int j = i;
                while(j < n && a[j] == a[i])
                    j++;
                ans = Math.min(ans, Math.max(i, n - j));
                i = j;
            }
            System.out.println(ans);
        }
    }
}