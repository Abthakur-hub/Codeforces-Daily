import java.util.*;

public class AShortSubstrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-->0) {
            String b = sc.next();
            StringBuilder ans = new StringBuilder();

            for (int i=0; i<b.length(); i+= 2) {
                ans.append(b.charAt(i));
            }

            ans.append(b.charAt(b.length() - 1));

            System.out.println(ans);
        }
    }
}