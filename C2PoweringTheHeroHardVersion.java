import java.util.*;

public class C2PoweringTheHeroHardVersion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            long ans = 0;

            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                if (v[i] != 0) {
                    pq.offer(v[i]);
                } else if (!pq.isEmpty()) {
                    ans += pq.poll();
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}