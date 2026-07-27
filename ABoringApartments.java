import java.util.*;

public class ABoringApartments {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int d = s.charAt(0) - '0';
            int n = s.length();
            int ans = (d-1)*10 + (n*(n+1))/2;
            System.out.println(ans);
        }
    }
    
}