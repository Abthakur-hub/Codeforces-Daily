import java.util.*;

public class BCircleGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            long mn = Long.MAX_VALUE;
            int pos = -1;

            for(int i=1; i<=n; i++){
                long x = sc.nextLong();

                if(x < mn){
                    mn = x;
                    pos = i;
                }
            }

            if(n % 2 == 1)
                System.out.println("Mike");
            else
                System.out.println(pos % 2 == 1 ? "Joe" : "Mike");
        }
    }
}