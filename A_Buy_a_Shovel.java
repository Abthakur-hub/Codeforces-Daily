import java.util.*;

public class A_Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int x = 1;

        while (true) {
            int lastDigit = (x * k) % 10;

            if (lastDigit == 0 || lastDigit == r) {
                System.out.println(x);
                break;
            }

            x++;
        }
    }
}