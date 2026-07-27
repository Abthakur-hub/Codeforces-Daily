import java.util.*;

public class CBrrBrrrPatapim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[2 * n + 1];

            HashSet<Integer> pos = new HashSet<>();
            HashSet<Integer> values = new HashSet<>();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                    int idx = i + j + 2;
                    if (!pos.contains(idx)) {
                        arr[idx] = a[i][j];
                        pos.add(idx);
                        values.add(a[i][j]);
                    }
                }
            }

            int missing = 0;
            for (int i = 1; i <= 2 * n; i++) {
                if (!values.contains(i)) {
                    missing = i;
                    break;
                }
            }

            int missPos = 0;
            for (int i = 1; i <= 2 * n; i++) {
                if (!pos.contains(i)) {
                    missPos = i;
                    break;
                }
            }

            arr[missPos] = missing;
            for (int i = 1; i <= 2 * n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}