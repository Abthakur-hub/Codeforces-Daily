import java.util.*;

public class G1DancesEasyVersion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt(); 

            int[] a = new int[n];
            int[] b = new int[n];

            a[0] = 1;

            for (int i = 1; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0, j = 0, cnt = 0;

            while (i < n && j < n) {

                if (a[i] < b[j]) {
                    cnt++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }

            System.out.println(n - cnt);
        }
    }
}