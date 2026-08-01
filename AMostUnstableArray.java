import java.util.*;

public class AMostUnstableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();

            if(n == 1)
                System.out.println(0);
            else if(n == 2)
                System.out.println(m);
            else
                System.out.println(2 * m);
        }
    }
}