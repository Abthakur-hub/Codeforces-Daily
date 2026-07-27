import java.util.*;

public class CTargetPractice{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int ans = 0;

            for (int i = 0; i < 10; i++) {

                String s = sc.next();

                for (int j = 0; j < 10; j++) {

                    if (s.charAt(j) == 'X') {

                        int l = Math.min(Math.min(i, j),Math.min(9 - i, 9 - j));

                        ans += (l + 1);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}