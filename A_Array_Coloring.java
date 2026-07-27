import java.util.*;

public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int len = 1;
            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1] + 1) {
                    len++;
                } else {
                    if (len % 2 == 1 && len > 1) {
                        possible = false;
                        break;
                    }
                    len = 1;
                }
            }

            // last segment check
            if (len % 2 == 1 && len > 1) {
                possible = false;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}