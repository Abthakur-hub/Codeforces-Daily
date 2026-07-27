import java.util.*;

public class ADonTTryToCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int count = 0;
            while (true) {
                if (x.contains(s)) {
                    System.out.println(count);
                    break;
                }
                if (x.length()>100) {
                    System.out.println(-1);
                    break;
                }
                x += x;
                count++;
            }
        }
    }
}