import java.util.*;

public class AHolidays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int w = n / 7;
        int r = n % 7;

        int base = w * 2;

        int[] a = {0, 0, 0, 0, 0, 1, 1};

        int mn = Integer.MAX_VALUE, mx = 0;

        for (int i = 0; i < 7; i++) {
            int cnt = 0;

            for (int j = 0; j < r; j++) {
                cnt += a[(i + j) % 7];
            }

            mn = Math.min(mn, cnt);
            mx = Math.max(mx, cnt);
        }

        System.out.println((base + mn) + " " + (base + mx));
    }
}