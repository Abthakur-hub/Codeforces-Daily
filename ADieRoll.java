import java.util.*;

public class ADieRoll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);

        int n = 6 - max + 1;
        int d = 6;
        int g = gcd(n,d);

        n/= g;
        d/= g;

        System.out.println(n + "/" + d);


    }
    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}