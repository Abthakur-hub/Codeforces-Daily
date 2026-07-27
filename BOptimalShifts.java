import java.util.*;

public class BOptimalShifts{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> v = new ArrayList<>();
            for (int i=0; i<n; i++) {
                if (s.charAt(i) == '1') {
                    v.add(i);
                }
            }
            if (v.size() == n) {
                System.out.println(0);
                continue;
            }
            int res = 0;
            int m = v.size();
            for (int i=0; i<m; i++) {
                int j = (i + 1) % m;
                int temp = (v.get(j) - v.get(i) - 1 + n) % n;
                res = Math.max(res, temp);
            }
            System.out.println(res);
        }
    }
}