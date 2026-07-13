import java.util.*;

public class BOrdinaryNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            String s = String.valueOf(n);

            int l = s.length();
            int f = s.charAt(0) - '0';

            int ans = (l - 1) * 9;

            int c = 0;
            for(int i=0; i<l; i++){
                c = c * 10 + f;
            }

            if(c <= n)
                ans += f;
            else
                ans += f - 1;

            System.out.println(ans);
        }
    }
}