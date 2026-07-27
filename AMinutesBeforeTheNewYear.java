import java.util.*;

public class AMinutesBeforeTheNewYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int h = sc.nextInt();
            int m = sc.nextInt();

            int total = h * 60 + m;

            System.out.println(1440 - total);
        }
    }
}