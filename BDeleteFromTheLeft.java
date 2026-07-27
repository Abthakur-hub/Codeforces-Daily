import java.util.*;

public class BDeleteFromTheLeft{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int i = s.length() - 1;
        int j = t.length() - 1;
        int c = 0;
        while (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
            c++;
            i--;
            j--;
        }
        System.out.println(s.length() + t.length() - 2 * c);
    }
}