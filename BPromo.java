import java.util.*;

public class BPromo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long[] suffix = new long[n + 1];
        suffix[n] = 0;
        for(int i=n - 1; i>=0; i--){
            suffix[i] = suffix[i + 1] + arr[i];
        }
        while(q-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int l = n - x;
            long ans = suffix[l] - suffix[l + y];
            System.out.println(ans);
        }
    }
}