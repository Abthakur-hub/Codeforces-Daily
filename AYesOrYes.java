import java.util.*;

public class AYesOrYes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int cnt = 0;

            for (char c : s.toCharArray()) {
                if (c == 'Y') cnt++;
            }

            System.out.println(cnt <= 1 ? "YES" : "NO");
        }
    }
}