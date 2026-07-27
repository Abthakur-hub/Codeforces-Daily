import java.util.*;

public class BVillagers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();

            Arrays.sort(a, Collections.reverseOrder());

            long ans = 0;

            for(int i=0; i<n; i+=2)
                ans += a[i];

            System.out.println(ans);
        }
    }
}