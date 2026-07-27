import java.util.*;

public class BNewYearCake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ans = 0;
            long x1 = 0, y1 = 0;
            long x2 = 0, y2 = 0;
            long p = 1;
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 1) {
                    x1 += p;
                    y2 += p;
                } else {
                    y1 += p;
                    x2 += p;
                }
                if ((x1 <= a && y1 <= b) || (x2 <= a && y2 <= b))
                    ans = i;
                else
                    break;
                p *= 2;
            }
            System.out.println(ans);
        }
    }
}