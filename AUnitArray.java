import java.util.*;

public class AUnitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0, pos = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) neg++;
                else pos++;
            }
            int a = 0;
            while (neg > pos) {
                a++;
                neg--;
                pos++;
            }
            if (neg % 2 != 0) a++;
            System.out.println(a);
        }
    }
}