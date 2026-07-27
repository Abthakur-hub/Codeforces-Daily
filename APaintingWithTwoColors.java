import java.util.*;

public class APaintingWithTwoColors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            boolean ok;

            if (a <= b) {
                ok = (n - b) % 2 == 0;
            } else {
                ok = (n - a) % 2 == 0 && (n - b) % 2 == 0;
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}