import java.util.*;

public class AKeyboard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char dir = sc.next().charAt(0);
        String s = sc.next();

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int idx = keyboard.indexOf(ch);

            if (dir == 'R') {
                ans.append(keyboard.charAt(idx - 1));
            } else {
                ans.append(keyboard.charAt(idx + 1));
            }
        }

        System.out.println(ans);
    }
}