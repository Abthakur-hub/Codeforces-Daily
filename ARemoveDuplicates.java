import java.util.*;

public class ARemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=n-1; i>=0; i--){
            if (!seen.contains(a[i])) {
                seen.add(a[i]);
                ans.add(a[i]);
            }
        }

        Collections.reverse(ans);

        System.out.println(ans.size());
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}