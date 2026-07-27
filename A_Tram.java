import java.util.*;

public class A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int max = 0;

        while (n-- > 0) {

            sum -= sc.nextInt();
            sum += sc.nextInt();

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}