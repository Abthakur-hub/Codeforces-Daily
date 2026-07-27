import java.util.*;

public class BAlternatingString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int b = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    b++;
                }
            }

            System.out.println(b <= 2 ? "YES" : "NO");
        }
    }
}