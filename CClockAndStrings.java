import java.util.*;

public class CClockAndStrings {

    static boolean between(int x, int a, int b) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return x > a && x < b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean cInside = between(c, a, b);
            boolean dInside = between(d, a, b);

            if (cInside != dInside) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}