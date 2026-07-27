import java.util.*;

public class AChips{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; ; i++) {
            int x = (i % n) + 1;

            if (m >= x) {
                m -= x;
            } else {
                break;
            }
        }

        System.out.println(m);
    }
}