import java.util.*;

public class BCrimsonTriples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long ans = 0;
            for(int b = 1; b <= n; b++){
                long cnt = n / b;
                ans += cnt * cnt;
            }

            System.out.println(ans);
        }
    }
}