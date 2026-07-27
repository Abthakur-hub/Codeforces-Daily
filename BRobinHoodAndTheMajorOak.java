import java.util.*;

public class BRobinHoodAndTheMajorOak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long v = (n + 1) / 2 - (n - k + 1) / 2;

            System.out.println(v % 2 == 0 ? "YES" : "NO");
        }
    }
}