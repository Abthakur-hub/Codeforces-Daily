import java.util.*;

public class B1PalindromeGameEasyVersion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int zeros = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
            }

            if (zeros == 1) {
                System.out.println("BOB");
            } else if ((zeros & 1) == 1 && s.charAt(n / 2) == '0') {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
    }
}