import java.util.*;

public class C1RenakoAmaoriAndXorGameEasyVersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            int x = 0;
            int y = 0;

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                x ^= a[i];
            }
            int last = -1;
            for (int i=0; i<n; i++) {
                b[i] = sc.nextInt();
                y ^= b[i];

                if (a[i]!=b[i]) {
                    last = i;
                }
            }
            if (x==y) {
                System.out.println("Tie");
            }
            else {
                if (last%2==0) {
                    System.out.println("Ajisai");
                } else {
                    System.out.println("Mai");
                }
            }
        }
    } 
}