import java.util.*;

public class CReplaceToMakeRegularBracketSequence {
    static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}') ||
               (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> st = new Stack<>();
        int changes = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("Impossible");
                    return;
                }

                char open = st.pop();

                if (!match(open, c)) {
                    changes++;
                }
            }
        }

        if (!st.isEmpty()) {
            System.out.println("Impossible");
        } else {
            System.out.println(changes);
        }

        sc.close();
    }
    
}