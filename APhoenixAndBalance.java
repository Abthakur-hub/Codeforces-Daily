import java.util.*;

public class APhoenixAndBalance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long sum1 = 0;
            long sum2 = 0;
            sum1 = 1L << n;
            for(int i=1; i<n/2; i++){
                sum1 += 1L << i;
            }
            for(int i=n/2; i<n; i++){
                sum2 += 1L << i;
            }
            System.out.println(Math.abs(sum1 - sum2));
        }
    }
}