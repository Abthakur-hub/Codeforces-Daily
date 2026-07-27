import java.util.*;

public class CSimpleRepetition {
    static boolean p(long n) {
        if (n<2) return false;
        for (long i=2; i*i<=n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            long x = sc.nextLong();
            int k = sc.nextInt();
            if (k==1) {
                if (p(x)) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if (x==1 && k==2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}