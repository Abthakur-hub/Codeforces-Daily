import java.util.*;

public class CBeautifulXor {

    static int msb(int x) {
        int p = -1;

        while (x > 0) {
            p++;
            x >>= 1;
        }

        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (msb(b) > msb(a)) {
                System.out.println(-1);
                continue;
            }

            if (a == b) {
                System.out.println(0);
                continue;
            }

            int k = msb(a);

            int m = (1 << (k + 1)) - 1;

            int x1 = a ^ m;
            int x2 = m ^ b;

            if (x1 == 0) {
                System.out.println(1);
                System.out.println(x2);
            } else if (x2 == 0) {
                System.out.println(1);
                System.out.println(x1);
            } else {
                System.out.println(2);
                System.out.println(x1 + " " + x2);
            }
        }
    }
}