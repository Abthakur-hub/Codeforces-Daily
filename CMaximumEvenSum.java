import java.util.*;

public class CMaximumEvenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if ((a & 1) == 1 && (b & 1) == 1) {
                System.out.println(a * b + 1);
                continue;
            }

            long g = b;
            while ((g & 1) == 0) {
                g >>= 1;
            }

            if (g == 1) {
                System.out.println(-1);
            } else {
                System.out.println(a * g + b / g);
            }
        }

        sc.close();
    }
}