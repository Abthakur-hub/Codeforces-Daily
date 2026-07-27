import java.util.*;

public class ABingoCandies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    int x = sc.nextInt();

                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
            }

            boolean ok = true;

            for (int freq : map.values()) {

                if (freq > n * (n - 1)) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}