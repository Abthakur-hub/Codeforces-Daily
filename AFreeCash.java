import java.util.*;

public class AFreeCash{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int ph = h;
        int pm = m;

        int c = 1;
        int mx = 1;
        for (int i=1; i<n; i++) {
            h = sc.nextInt();
            m = sc.nextInt();
            if (h == ph && m == pm) {
                c++;
            } else {
                c = 1;
                ph = h;
                pm = m;
            }
            if (c > mx) {
                mx = c;
            }
        }
        System.out.println(mx);
    }
}