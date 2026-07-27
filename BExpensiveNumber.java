import java.util.*;

public class BExpensiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            int z = 0;
            int mx = 0;

            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    z++;
                } else {
                    mx = Math.max(mx, z+1);
                }
            }
            System.out.println(s.length()-mx);
        }
    }
}