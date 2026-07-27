import java.util.*;

public class A_Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int count = 0;

        while (n > 0) {
            long digit = n % 10;
            if (digit == 4 || digit == 7) {
                count++;
            }
            n /= 10;
        }

        boolean Lucky = true;
        if (count == 0) Lucky = false;

        while (count > 0) {
            int digit = count % 10;
            if (digit != 4 && digit != 7) {
                Lucky = false;
                break;
            }
            count /= 10;
        }

        if (Lucky) System.out.println("YES");
        else System.out.println("NO");
    }
}