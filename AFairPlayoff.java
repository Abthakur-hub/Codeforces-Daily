import java.util.*;

public class AFairPlayoff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] s = new int[4];

            for (int i = 0; i < 4; i++) {
                s[i] = sc.nextInt();
            }

            int a = Math.max(s[0], s[1]);
            int b = Math.max(s[2], s[3]);

            int[] arr = s.clone();
            Arrays.sort(arr);

            if ((a == arr[3] && b == arr[2]) || (a == arr[2] && b == arr[3])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}