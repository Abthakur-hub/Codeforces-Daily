import java.util.*;

public class ACoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            int c = 0;
            boolean flag = false;
            for (int i=0; i<n; i++) {
                if (s.charAt(i) == '.') {
                    c++;
                    ans++;
                    if (c>=3) flag = true;
                } else {
                    c = 0;
                }
            }
            if (flag) System.out.println(2);
            else System.out.println(ans);
        }
    }
}