import java.util.*;

public class BJourney{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long sum = a + b + c;
            long days = (n - 1) / sum * 3;
            long covered = days / 3 * sum;

            if(covered + a >= n)
                days += 1;
            else if (covered + a + b >= n)
                days += 2;
            else
                days += 3;

            System.out.println(days);
        }
    }
}