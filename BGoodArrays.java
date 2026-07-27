import java.util.*;

public class BGoodArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long sum = 0, ones = 0;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                sum += x;
                if(x == 1)
                    ones++;
            }
            if(n == 1)
                System.out.println("NO");
            else if(sum >= n+ones)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}