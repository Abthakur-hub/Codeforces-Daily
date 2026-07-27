import java.util.*;

public class CLongestRegularBracketSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int mx = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    int len = i - st.peek();

                    if (len > mx) {
                        mx = len;
                        c = 1;
                    } else if (len == mx) {
                        c++;
                    }
                }
            }
        }

        if (mx == 0) {
            System.out.println("0 1");
        } else {
            System.out.println(mx + " " + c);
        }

        sc.close();
    }
}