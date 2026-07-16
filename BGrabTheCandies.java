import java.util.*;

public class BGrabTheCandies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int evenSum = 0;
            int oddSum = 0;

            for(int i=0; i<n; i++){
                int x = sc.nextInt();

                if(x % 2 == 0)
                    evenSum += x;
                else
                    oddSum += x;
            }

            System.out.println(evenSum > oddSum ? "YES" : "NO");
        }
    }
}
