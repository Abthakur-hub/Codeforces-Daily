import java.util.*;

public class ASquareYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = Integer.parseInt(s);

            int root = (int) Math.sqrt(n);

            if (root * root == n) {
                System.out.println(0 + " " + root);
            } else {
                System.out.println(-1);
            }
        }
    }
}