import java.util.*;

public class BSquaresAndCubes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            long a = sc.nextLong();

            HashSet<Long> set = new HashSet<>();

            for (long i = 1; i * i <= a; i++) {
                set.add(i * i);
            }
            for (long i = 1; i * i * i <= a; i++) {
                set.add(i * i * i);
            }

            System.out.println(set.size());
        }
    }
}