import java.util.*;

public class DBinaryCut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {

            String s = sc.next();

            int a = 1;

            for (int i = 0; i < s.length() - 1; i++) {

                if (s.charAt(i) != s.charAt(i + 1)) {
                    a++;
                }
            }

            if (s.contains("01")) {
                a--;
            }

            System.out.println(a);
        }
    }
}