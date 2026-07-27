import java.util.*;

public class CRedBlackPairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            int[] dp = new int[n + 1];
            Arrays.fill(dp, (int)1e9);
            dp[0] = 0;
            dp[1] = (s.charAt(0) != t.charAt(0)) ? 1 : 0;
            for(int i=2; i<=n; i++){
                dp[i] = Math.min(dp[i],
                        dp[i - 1] + ((s.charAt(i - 1) != t.charAt(i - 1)) ? 1 : 0));
                dp[i] = Math.min(dp[i],
                        dp[i - 2]
                        + ((s.charAt(i - 2) != s.charAt(i - 1)) ? 1 : 0)
                        + ((t.charAt(i - 2) != t.charAt(i - 1)) ? 1 : 0));
            }
            System.out.println(dp[n]);
        }
    }
}