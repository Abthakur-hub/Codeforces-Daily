import java.util.*;

public class BImpostOrSus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] s = sc.next().toCharArray();
            int ans = 0, n = s.length;
            if (s[0] == 'u') {
                s[0] = 's';
                ans++;
            }
            if (s[n - 1] == 'u') {
                s[n - 1] = 's';
                ans++;
            }
            for (int i = 1; i < n - 1; i++) {
                if (s[i] == 'u') {
                    if (s[i - 1] != 's') {
                        s[i - 1] = 's';
                        ans++;
                    }
                    if (s[i + 1] != 's') {
                        s[i + 1] = 's';
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}