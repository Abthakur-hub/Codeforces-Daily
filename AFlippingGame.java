import java.util.*;

public class AFlippingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int one = 0;
        int cur = 0;
        int best = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();

            if(x == 0){
                cur++;
            }
            else{
                cur--;
                one++;
            }

            best = Math.max(best, cur);

            if(cur < 0)
                cur = 0;
        }

        System.out.println(one + best);
    }
}