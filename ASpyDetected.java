import java.util.*;

public class ASpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int majority;

            if (a[0] == a[1]) {
                majority = a[0];
            } else if (a[0] == a[2]) {
                majority = a[0];
            } else {
                majority = a[1];
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != majority) {
                    System.out.println(i + 1); 
                    break;
                }
            }
        }
        sc.close();
    }
}