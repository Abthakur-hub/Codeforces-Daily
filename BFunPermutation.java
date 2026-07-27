import java.util.*;

public class BFunPermutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i=0; i<n; i++) {
                p[i] = sc.nextInt();
            }

            for (int i=0; i<n; i++) {
                System.out.print((n + 1 - p[i]) + " ");
            }
            System.out.println();
        }
    }
}