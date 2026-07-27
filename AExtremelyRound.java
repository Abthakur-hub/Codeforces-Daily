import java.util.*;

public class AExtremelyRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String n = sc.next();
            int a = n.length();
            int f = n.charAt(0) - '0';
            int ans = (a-1)*9+f;
            System.out.println(ans);
        }
    }
}