import java.util.*;

public class BMikeAndFeet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();

        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long[] ans = new long[n + 1];

        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            ans[len] = Math.max(ans[len], a[i]);
        }

        for (int i = n - 1; i >= 1; i--)
            ans[i] = Math.max(ans[i], ans[i + 1]);

        for (int i = 1; i <= n; i++)
            System.out.print(ans[i] + " ");
    }
}