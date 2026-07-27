import java.util.*;

public class ABachgoldProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> ans = new ArrayList<>();

        if (n % 2 == 0) {
            while (n > 0) {
                ans.add(2);
                n -= 2;
            }
        } else {
            ans.add(3);
            n -= 3;

            while (n > 0) {
                ans.add(2);
                n -= 2;
            }
        }

        System.out.println(ans.size());

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}