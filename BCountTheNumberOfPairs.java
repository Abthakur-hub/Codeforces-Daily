import java.util.*;

public class BCountTheNumberOfPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] l = new int[26];
            int[] u = new int[26];
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c))
                    l[c - 'a']++;
                else
                    u[c - 'A']++;
            }
            int ans = 0;
            for (int i = 0; i < 26; i++) {
                int x = Math.min(l[i], u[i]);
                ans += x;
                l[i] -= x;
                u[i] -= x;
                int y = Math.max(l[i], u[i]) / 2;
                int tp = Math.min(y, k);
                ans += tp;
                k -= tp;
            }
            System.out.println(ans);
        }
    }
}