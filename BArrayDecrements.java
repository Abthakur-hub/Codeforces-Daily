import java.util.*;

public class BArrayDecrements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();

            for(int i=0; i<n; i++)
                b[i] = sc.nextInt();

            int d = 0;

            for(int i=0; i<n; i++)
                d = Math.max(d, a[i] - b[i]);

            boolean ok = true;

            for(int i=0; i<n; i++){
                if(a[i] < b[i]){
                    ok = false;
                    break;
                }

                if(b[i] != 0 && a[i] - b[i] != d){
                    ok = false;
                    break;
                }
                if(b[i] == 0 && a[i] - b[i] > d){
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}