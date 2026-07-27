import java.util.*;

public class ADoNotBeDistracted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            boolean flag = true;
            set.add(s.charAt(0));
            for (int i = 1; i < n; i++) {
                char c = s.charAt(i);
                if (c != s.charAt(i - 1)) {
                    if (set.contains(c)) {
                        flag = false;
                        break;
                    }
                    set.add(c);
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}