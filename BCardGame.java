import java.util.*;

public class BCardGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int ans = 0;

            int[][] A = {{a1, a2}, {a2, a1}};
            int[][] B = {{b1, b2}, {b2, b1}};

            for (int[] a : A) {
                for (int[] b : B) {
                    int win = 0, lose = 0;

                    if (a[0] > b[0]) win++;
                    else if (a[0] < b[0]) lose++;

                    if (a[1] > b[1]) win++;
                    else if (a[1] < b[1]) lose++;

                    if (win > lose) ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}