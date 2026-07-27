import java.util.*;

public class BTheSecretNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();

            ArrayList<Long> a = new ArrayList<>();

            long p = 10;

            for(int k=1; k<=17; k++) {
                long d = p + 1;

                if(n % d == 0) {
                    a.add(n / d);
                }

                if(p > Long.MAX_VALUE / 10) break;
                p *= 10;
            }

            Collections.sort(a);

            System.out.println(a.size());

            if(a.size() > 0) {
                for(long x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}