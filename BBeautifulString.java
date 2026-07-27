import java.util.*;

public class BBeautifulString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ans.add(i + 1);
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}