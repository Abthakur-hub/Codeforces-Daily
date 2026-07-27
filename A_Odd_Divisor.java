import java.util.*;

public class A_Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long a = sc.nextLong();

            while (a % 2 == 0) {
                a /= 2;
            }

            if (a > 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}