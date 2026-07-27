import java.util.*;

public class AHeist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println(max-min+1-n);
    }
}