import java.util.*;

public class C1PoweringTheHeroEasyVersion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            long ans = 0;

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                if (v[i] != 0) {
                    pq.offer(v[i]);
                } else {
                    if (!pq.isEmpty()) {
                        ans += pq.poll();
                    }
                }
            }

            System.out.println(ans);
        }
    }
}