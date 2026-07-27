 import java.util.*;

public class BPalindromeTwelveAndTwoTerms{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 11};

        while(t-->0){
            long n = sc.nextLong();

            if(n == 10){
                System.out.println(-1);
                continue;
            }

            long a = v[(int) (n % 12)];
            long b = n - a;

            System.out.println(a + " " + b);
        }
    }
}