import java.util.*;

public class AMinimalSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = Math.min(a, b);
            int y = Math.max(a, b);

            int side = Math.max(2 * x, y);

            System.out.println(side * side);
        }
    }
}