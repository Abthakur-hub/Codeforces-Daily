import java.util.*;

public class AElections{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long A = Math.max(0, Math.max(b, c) - a + 1);
            long B = Math.max(0, Math.max(a, c) - b + 1);
            long C = Math.max(0, Math.max(a, b) - c + 1);

            System.out.println(A + " " + B + " " + C);
        }
    }
}