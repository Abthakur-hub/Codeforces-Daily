import java.util.*;

public class B_New_Year_s_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int a = sc.nextInt();

            int b = a / 2020;
            int c = a % 2020;

            if (c <= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}