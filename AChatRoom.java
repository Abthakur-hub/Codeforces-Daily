import java.util.*;

public class AChatRoom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = "hello";
        int idx = 0;
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == target.charAt(idx)) {
                idx++;
            }
            if (idx == target.length()) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}