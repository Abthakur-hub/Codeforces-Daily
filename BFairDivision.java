import java.util.*;

public class BFairDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int o = 0;
            int tw = 0;
            int s = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) o++;
                else tw++;
                s+=x;
            }
            if (s%2==1) {
                System.out.println("NO");
            }
            else {
                int h = s / 2;
                if (h%2==1 && o==0) {
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}