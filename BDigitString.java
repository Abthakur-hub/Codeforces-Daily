import java.util.*;

public class BDigitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int[] sf = new int[n + 1];

            for (int i=n-1; i>=0; i--) {
                sf[i] = sf[i + 1];
                char c = s.charAt(i);
                if (c=='1' || c=='3') {
                    sf[i]++;
                }
            }

            int ts = 0;
            int b = 0;

            for (int i = 0; i <= n; i++) {
                b = Math.max(b, ts + sf[i]);
                if (i<n && s.charAt(i)=='2') {
                    ts++;
                }
            }
            System.out.println(n-b);
        }
    }
}