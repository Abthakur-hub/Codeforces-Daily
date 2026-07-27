import java.util.*;

public class BScale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
            }
            for (int i = 0; i < n; i += k) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j += k) {
                    sb.append(grid[i].charAt(j));
                }
                System.out.println(sb);
            }
        }
    }
}