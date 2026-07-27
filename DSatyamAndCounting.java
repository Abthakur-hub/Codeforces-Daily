import java.util.*;

public class DSatyamAndCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            HashSet<Integer> y0 = new HashSet<>();
            HashSet<Integer> y1 = new HashSet<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(y == 0) y0.add(x);
                else y1.add(x);
            }
            long ans = 0;
            for(int x : y0){
                if(y1.contains(x)){
                    ans += (long) (n - 2);
                }
            }
            for(int x : y0){
                if(y1.contains(x - 1) && y1.contains(x + 1)){
                    ans++;
                }
            }
            for(int x : y1){
                if(y0.contains(x - 1) && y0.contains(x + 1)){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}