import java.util.*;

public class BHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();
            long q = m / k;
            long r = m % k;
            long cur;
            if (q % 2 == 1 && k < s) {
                cur = k;
            } else {
                cur = s;
            }
            System.out.println(Math.max(0, cur - r));
        }
    }
}