import java.util.*;

public class BDifferentDistances{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println("1 2 2 1 2 1 1 2");
                continue;
            }

            int shift = 0;

            for (int block = 0; block < 4; block++) {
                for (int i = 0; i < n; i++) {
                    int val = (i + shift) % n + 1;
                    System.out.print(val + " ");
                }

                if (block == 0)
                    shift = (shift + 1) % n;
                else if (block == 1)
                    shift = (shift + 2) % n;
                else if (block == 2)
                    shift = (shift + 3) % n;
            }
            System.out.println();
        }
    }
}