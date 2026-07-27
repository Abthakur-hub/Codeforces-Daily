import java.util.*;

public class AMorning {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-->0) {

            String s = sc.next();
            int cur = 1;
            int ans = 0;

            for (int i = 0; i < 4; i++) {
                int d = s.charAt(i) - '0';

                if (d == 0) d = 10;

                ans += Math.abs(cur - d);
                ans++; 
                cur = d;
            }
            System.out.println(ans);
        }
    }
}