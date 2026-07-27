import java.util.*;

public class ADesorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            boolean sorted = true;
            for(int i=0; i<n-1; i++){
                if(a[i] > a[i + 1]){
                    sorted = false;
                    break;
                }
            }
            if(!sorted){
                System.out.println(0);
                continue;
            }
            long ans = Long.MAX_VALUE;
            for(int i=0; i<n-1; i++){
                long diff = a[i + 1] - a[i];
                ans = Math.min(ans, diff / 2 + 1);
            }
            System.out.println(ans);
        }
    }
}