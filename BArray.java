import java.util.*;

public class BArray{

    static void arrindx(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n - 1; i++) {
            int greater = 0, smaller = 0;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    smaller++;
                } else if (arr[i] < arr[j]) {
                    greater++;
                }
            }

            ans[i] = Math.max(greater, smaller);
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            arrindx(arr);
        }
    }
}