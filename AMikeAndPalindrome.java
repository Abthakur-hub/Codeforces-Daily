import java.util.*;

public class AMikeAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        int c = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                c++;
            }
            i++;
            j--;
        }
        if (c == 1 || (c == 0 && s.length() % 2 == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}