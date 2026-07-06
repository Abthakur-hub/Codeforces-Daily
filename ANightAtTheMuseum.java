import java.util.*;

public class ANightAtTheMuseum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char current = 'a';
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int diff = Math.abs(ch - current);
            ans += Math.min(diff, 26 - diff);

            current = ch;
        }

        System.out.println(ans);
    }
}