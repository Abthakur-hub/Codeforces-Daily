import java.util.*;

public class AMarisaStealsReimuSTakeout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int a = sc.nextInt();
            int zero = 0, one = 0, two = 0;

            for (int i = 0; i < a; i++) {
                int x = sc.nextInt();
                if (x == 0) zero++;
                else if (x == 1) one++;
                else two++;
            }

            int result = zero;
            int pair = Math.min(one, two);
            result += pair;
            one -= pair;
            two -= pair;
            result += one / 3;
            result += two / 3;

            System.out.println(result);
        }
    }
}