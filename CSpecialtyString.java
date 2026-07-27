import java.util.*;

public class CSpecialtyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for (char ch:s.toCharArray()) {
                if (!st.isEmpty() && st.peek() == ch) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
            System.out.println(st.isEmpty() ? "YES" : "NO");
        }
    }
}