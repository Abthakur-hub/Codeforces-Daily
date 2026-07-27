import java.util.*;

public class A_Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int[][] arr = new int[a][a];

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    arr[i][j] = sc.nextInt();
                    set.add(arr[i][j]);
                }
            }

            if (set.size() > a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}