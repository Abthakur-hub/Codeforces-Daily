import java.util.*;

public class BRemiliaPlaysSoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long k = sc.nextLong();
            if (n <= 3) {
                System.out.println(1);
                continue;
            }
            long b = Math.abs(x1 - x2);
            long d = Math.min(b, n - b);
            System.out.println(d + k);
        }
    }
}