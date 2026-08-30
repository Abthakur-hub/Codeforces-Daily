import java.util.*;

public class ANewWorldNewMeNewArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            if (k == 0) {
                System.out.println(0);
            } 
            else if (Math.abs(k) > n * p) {
                System.out.println(-1);
            } 
            else {
                int operations = (Math.abs(k) + p - 1) / p;
                System.out.println(operations);
            }
        }
    }
}