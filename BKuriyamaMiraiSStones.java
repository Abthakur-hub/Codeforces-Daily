import java.util.*;

public class BKuriyamaMiraiSStones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLong();

        long[] p1 = new long[n];
        p1[0] = a[0];

        for(int i = 1; i < n; i++)
            p1[i] = p1[i - 1] + a[i];

        long[] b = a.clone();
        Arrays.sort(b);

        long[] p2 = new long[n];
        p2[0] = b[0];

        for(int i = 1; i < n; i++)
            p2[i] = p2[i - 1] + b[i];

        int q = sc.nextInt();

        while(q-- > 0){
            int t = sc.nextInt();
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            if(t == 1)
                System.out.println(p1[r] - (l > 0 ? p1[l - 1] : 0));
            else
                System.out.println(p2[r] - (l > 0 ? p2[l - 1] : 0));
        }
    }
}