import java.util.*;

public class AMakeItBeautiful{

    static boolean check(List<Integer> a) {
        int sum = 0;
        for (int x : a) {
            if (x == sum) return false;
            sum += x;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if (arr[0] == arr[n - 1]) {
                System.out.println("NO");
                continue;
            }

            List<Integer> ans = new ArrayList<>();

            int l = 0, r = n - 1;

            ans.add(arr[l++]);

            while (l <= r) {
                ans.add(arr[r--]);
                if (l <= r) {
                    ans.add(arr[l++]);
                }
            }

            if (!check(ans)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}