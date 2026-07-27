import java.util.*;

public class CVesselsHeightsAndTwoVersionsEasyVersion{
    static void solve(Scanner sc) {
        int n = sc.nextInt();

        long[] v = new long[n];
        for(int i=0; i<n; i++) v[i] = sc.nextLong();

        long[] a = new long[n];

        for(int i=0; i<n; i++){
            long[] f = new long[n];
            long[] o = new long[n];

            long c = 0;
            for(int j=1; j<n; j++){
                int p = (i + j - 1) % n;
                int r = (i + j) % n;
                c = Math.max(c, v[p]);
                f[r] = c;
            }

            c = 0;
            for(int j=1; j<n; j++){
                int r = (i - j + n) % n;
                c = Math.max(c, v[r]);
                o[r] = c;
            }

            long w = 0;
            for(int j=0; j<n; j++){
                if(j != i) w += Math.min(f[j], o[j]);
            }
            a[i] = w;
        }

        for(int i=0; i<n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0) solve(sc);
    }
}