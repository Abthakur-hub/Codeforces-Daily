import java.util.*;

public class BFriendsAndCandies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int avg = sum / n;
            int add = 0, sub = 0, cnt = 0;

            for (int x : a) {
                if (x > avg) {
                    add += x - avg;
                    cnt++;
                } else if (x < avg) {
                    sub += avg - x;
                }
            }

            System.out.println(add == sub ? cnt : -1);
        }
    }
}