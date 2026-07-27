import java.util.*;

public class ARobinHelps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] v = new int[n];
            for(int i=0; i<n; i++){
                v[i] = sc.nextInt();
            }

            int val = 0;
            int cnt = 0;

            for(int x : v){
                if (x >= k) {
                    val += x;
                } else if (x == 0) {
                    if (val > 0) {
                        cnt++;
                        val--;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}