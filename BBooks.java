import java.util.*;

public class BBooks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int l = 0;
        long s = 0;
        int mx = 0;
        for(int r=0; r<n; r++){
            s += a[r];
            while(s > t){
                s -= a[l];
                l++;
            }
            mx = Math.max(mx, r-l+1);
        }
        System.out.println(mx);
    }
}