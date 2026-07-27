import java.util.*;

public class BPrinzessinDerVerurteilung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<String> set = new HashSet<>();
            for (int len = 1; len <= 3; len++) {
                for (int i = 0; i + len <= n; i++) {
                    set.add(s.substring(i, i + len));
                }
            }
            boolean found = false;
            for (char a = 'a'; a <= 'z' && !found; a++) {
                String cur = String.valueOf(a);
                if (!set.contains(cur)) {
                    System.out.println(cur);
                    found = true;
                }
            }
            for (char a = 'a'; a <= 'z' && !found; a++) {
                for (char b = 'a'; b <= 'z' && !found; b++) {
                    String cur = "" + a + b;
                    if (!set.contains(cur)) {
                        System.out.println(cur);
                        found = true;
                    }
                }
            }
            for (char a = 'a'; a <= 'z' && !found; a++) {
                for (char b = 'a'; b <= 'z' && !found; b++) {
                    for (char c = 'a'; c <= 'z' && !found; c++) {
                        String cur = "" + a + b + c;
                        if (!set.contains(cur)) {
                            System.out.println(cur);
                            found = true;
                        }
                    }
                }
            }
        }
    }
}