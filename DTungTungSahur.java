import java.util.*;

public class DTungTungSahur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String p = sc.next();
            String s = sc.next();

            int i = 0, j = 0;

            boolean flag = true;

            while (i < p.length() && j < s.length()) {

                if (p.charAt(i) != s.charAt(j)) {
                    flag = false;
                    break;
                }

                int c1 = 1;
                int c2 = 1;

                while (i < p.length() - 1 &&
                       p.charAt(i) == p.charAt(i + 1)) {
                    c1++;
                    i++;
                }

                while (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                    c2++;
                    j++;
                }

                if (!(c1 <= c2 && c2 <= 2 * c1)) {
                    flag = false;
                    break;
                }

                i++;
                j++;
            }

            if (i != p.length() || j != s.length()) {
                flag = false;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}