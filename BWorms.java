import java.util.*;

public class BWorms{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int q = sc.nextInt();
        int[] x = new int[q];
        for(int i = 0; i < q; i++)
            x[i] = sc.nextInt();
        int[] pre = new int[n];
        pre[0] = a[0];
        for(int i = 1; i < n; i++)
            pre[i] = pre[i - 1] + a[i];
        for(int i = 0; i < q; i++){
            int l = 0, r = n - 1;
            int ans = n - 1;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(pre[mid] >= x[i]){
                    ans = mid;
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            System.out.println(ans + 1);
        }
    }
}