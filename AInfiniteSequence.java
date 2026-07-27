import java.util.*;

public class AInfiniteSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = 0;
        for (long i=1; ; i++) {
            s += i;
            if (s == n) {
                System.out.println(i);
                break;
            }
            else if (s > n) {
                System.out.println(n - (s - i));
                break;
            }
        }
    }
}