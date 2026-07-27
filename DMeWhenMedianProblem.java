import java.io.*;
import java.util.*;

public class DMeWhenMedianProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            if(n == 1){
                System.out.println(Math.min(a[0], b[0]));
                continue;
            }

            int ans = 0;

            for(int i = 0; i < n - 1; i++){

                int x = Math.max(a[i], b[i]);
                int y = Math.max(a[i + 1], b[i + 1]);

                ans = Math.max(ans, Math.min(x, y));
            }

            System.out.println(ans);
        }
    }
}