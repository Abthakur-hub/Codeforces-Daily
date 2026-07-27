import java.util.*;

public class AWaterBuying{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            System.out.println(Math.min(x * y, (x / 2) * z + (x % 2) * y));
        }
    }
}