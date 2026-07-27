import java.util.*;

public class BDifferentString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            boolean same = true;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("NO");
            } else {

                char[] arr = s.toCharArray();

                Arrays.sort(arr);

                String r = new String(arr);

                if (r.equals(s)) {
                    r = new StringBuilder(r).reverse().toString();
                }

                System.out.println("YES");
                System.out.println(r);
            }
        }

        sc.close();
    }
}