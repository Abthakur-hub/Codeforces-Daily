import java.util.*;

public class ARecyclingCenter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                int d = -1;
                while (x <= c) {
                    d++;
                    x *= 2;
                }
                a.add(d);
            }
            Collections.sort(a);
            int free = 0;
            for (int d : a)
                if (d >= free) free++;

            System.out.println(n - free);
        }
    }
}