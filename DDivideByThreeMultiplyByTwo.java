import java.util.*;

public class DDivideByThreeMultiplyByTwo{

    static long cnt(long n) {
        long c = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Long[] arr = new Long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr, (a, b) -> {
            long cntA = cnt(a);
            long cntB = cnt(b);

            if (cntA != cntB) {
                return Long.compare(cntB, cntA); 
            }
            return Long.compare(a, b);
        });

        for (long x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}