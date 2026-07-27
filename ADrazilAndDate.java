import java.util.*;

public class ADrazilAndDate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();
        long d = Math.abs(a) + Math.abs(b);
        if (s>=d && (s-d)%2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}