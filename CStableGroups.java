import java.util.*;

public class CStableGroups{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long[] a = new long[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        ArrayList<Long> costs = new ArrayList<>();
        int groups = 1;
        for(int i=1; i<n; i++){
            long gap = a[i] - a[i - 1];
            if (gap > x) {
                groups++;
                long need = (gap - 1) / x;
                costs.add(need);
            }
        }
        Collections.sort(costs);
        for(long need : costs){
            if(k >= need){
                k -= need;
                groups--;
            }
            else{
                break;
            }
        }
        System.out.println(groups);
    }
}