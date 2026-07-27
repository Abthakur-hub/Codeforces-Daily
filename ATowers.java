import java.util.*;

public class ATowers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int h = Integer.MIN_VALUE;
        for (int val : map.values()) {
            h = Math.max(h, val);
        }
        int t = map.size();
        System.out.println(h + " " + t);
    }
}