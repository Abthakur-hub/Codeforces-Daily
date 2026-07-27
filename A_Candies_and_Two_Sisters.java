import java.util.*;

public class A_Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            long a = sc.nextLong();
            System.out.println((a - 1) / 2);
        }
    }
}