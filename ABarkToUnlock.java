import java.util.*;

public class ABarkToUnlock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        boolean a = false, b = false;

        while (n-- > 0) {
            String x = sc.next();

            if (x.equals(s)) {
                System.out.println("YES");
                return;
            }

            if (x.charAt(1) == s.charAt(0)) a = true;
            if (x.charAt(0) == s.charAt(1)) b = true;
        }

        System.out.println(a && b ? "YES" : "NO");
    }
}