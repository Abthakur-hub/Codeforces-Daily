import java.util.*;

public class BTaxi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0, two = 0, three = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) one++;
            else if (x == 2) two++;
            else if (x == 3) three++;
            else ans++;
        }

        ans += three;
        one = Math.max(0, one - three);

        ans += two / 2;
        two %= 2;

        if (two == 1) {
            ans++;
            one = Math.max(0, one - 2);
        }
        ans += (one + 3) / 4;
        System.out.println(ans);
    }
}