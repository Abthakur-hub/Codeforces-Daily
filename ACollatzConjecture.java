import java.util.*;

public class ACollatzConjecture{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();

            long ans = x;

            while(k-- > 0) {
                ans *= 2;
            }

            System.out.println(ans);
        }
    }
}