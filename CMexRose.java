import java.util.*;

public class CMexRose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] f = new int[n + 1];

            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                f[x]++;
            }

            int m = 0;

            for(int i=0; i<k; i++){
                if(f[i] == 0)
                    m++;
            }

            System.out.println(Math.max(m, f[k]));
        }
    }
}