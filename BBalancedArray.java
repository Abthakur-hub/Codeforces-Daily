import java.util.*;

public class BBalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if ((n/2)%2==1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            int h = n / 2;
            int s1 = 0;
            int s2 = 0;
            for (int i=1; i<=h; i++) {
                int x = 2 * i;
                s1 += x;
                System.out.print(x + " ");
            }
            for (int i=1; i<h; i++) {
                int x = 2 * i - 1;
                s2 += x;
                System.out.print(x + " ");
            }
            System.out.println(s1 - s2);
        }
    }
}