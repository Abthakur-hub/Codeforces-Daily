import java.util.*;

public class CArrangeTheNumbersInACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long a = 0;
            long b = 0;
            long c = 0;
            int d = 0;
            for (int i=0; i<n; i++) {
                long x = sc.nextLong();
                if (x==1) {
                    c++;
                } else {
                    d++;
                    a += x;
                    b += (x - 2) / 2;
                }
            }
            if (d==0) {
                System.out.println(0);
                continue;
            }
            if (d == 1) b++;

            long ans = a + Math.min(c, b);
            if (ans < 3) ans = 0;

            System.out.println(ans);
        }
    }
}