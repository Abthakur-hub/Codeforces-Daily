import java.util.*;

public class AInsertDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            String s = sc.next();

            boolean ok = true;

            for(int i=0; i<n; i++){
                if(s.charAt(i) - '0' < d){
                    s = s.substring(0, i) + d + s.substring(i);
                    ok = false;
                    break;
                }
            }

            if(ok)
                s += d;

            System.out.println(s);
        }
    }
}