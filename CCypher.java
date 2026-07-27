import java.util.*;

public class CCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                String s = sc.next();
                int cur = a[i];
                for (int j = b - 1; j >= 0; j--) {
                    if (s.charAt(j) == 'U') {
                        cur--;
                        if (cur < 0) cur = 9;
                    } else {
                        cur++;
                        if (cur > 9) cur = 0;
                    }
                }
                System.out.print(cur + " ");
            }
            System.out.println();
        }
    }
}