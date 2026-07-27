import java.util.*;

public class AFrogJumping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long p = k / 2;
            long ans = p * (a - b);
            if (k%2==1) {
                ans += a;
            }
            System.out.println(ans);
        }
    }
}