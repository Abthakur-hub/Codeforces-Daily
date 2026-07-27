import java.util.*;

public class FEatingCandies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] v = new int[n];
            for(int i = 0; i < n; i++)
                v[i] = sc.nextInt();

            long a = 0, b = 0;
            int s = 0, e = n - 1, c = 0;

            while(s <= e){
                if(a >= b){
                    b += v[e];
                    e--;
                }
                else{
                    a += v[s];
                    s++;
                }

                if(a == b)
                    c = Math.max(c, s + (n - e - 1));
            }

            System.out.println(c);
        }
    }
}