import java.util.*;

public class CChooseTheDifferentOnes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            boolean[] x = new boolean[k + 1];
            boolean[] y = new boolean[k + 1];
            for(int i = 0; i < n; i++){
                int v = sc.nextInt();
                if(v <= k) x[v] = true;
            }
            for(int i = 0; i < m; i++){
                int v = sc.nextInt();
                if(v <= k) y[v] = true;
            }
            int a = 0, b = 0, c = 0;
            boolean ok = true;
            for(int i = 1; i <= k; i++){
                if(!x[i] && !y[i]){
                    ok = false;
                    break;
                }
                if(x[i] && !y[i]) a++;
                else if(!x[i] && y[i]) b++;
                else c++;
            }
            if(a > k / 2 || b > k / 2) ok = false;
            System.out.println(ok && a + c >= k / 2 && b + c >= k / 2 ? "YES" : "NO");
        }
    }
}