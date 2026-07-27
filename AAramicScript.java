import java.util.*;

public class AAramicScript{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        while (t-->0) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 || arr[i] != arr[i - 1]) {
                    sb.append(arr[i]);
                }
            }
            set.add(sb.toString());
        }
        System.out.println(set.size());
    }
}