import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                int cnt = 0;

                while (i < n && s.charAt(i) == 'x') {
                    cnt++;
                    i++;
                }

                if (cnt >= 3) {
                    ans += cnt - 2;
                }

                i--;
            }
        }

        System.out.println(ans);
    }
}