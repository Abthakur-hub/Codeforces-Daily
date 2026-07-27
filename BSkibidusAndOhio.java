import java.util.*;

public class BSkibidusAndOhio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-->0) {

            String s = sc.next();

            boolean flag = false;

            for (int i=0; i<s.length()-1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? 1 : s.length());
        }
    }
}