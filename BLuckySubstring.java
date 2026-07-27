import java.util.*;

public class BLuckySubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0, b = 0;
        for (char c : s.toCharArray()) {
            if (c == '4') a++;
            else if (c == '7') b++;
        }
        if (a == 0 && b == 0)
            System.out.println(-1);
        else
            System.out.println(a >= b ? 4 : 7);
    }
}