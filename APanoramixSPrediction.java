import java.util.*;

public class APanoramixSPrediction {

    static boolean p(int n) {
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = n + 1;
        while (!p(x)) {
            x++;
        }
        if (x==m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}