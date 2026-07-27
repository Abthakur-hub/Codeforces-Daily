import java.util.*;

public class AOlesyaAndRodion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        if (t == 10 && n == 1) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        if (t == 10) {
            sb.append(1);

            for (int i = 1; i < n; i++) {
                sb.append(0);
            }
        } else {

            sb.append(t);

            for (int i = 1; i < n; i++) {
                sb.append(0);
            }
        }

        System.out.println(sb);
    }
}