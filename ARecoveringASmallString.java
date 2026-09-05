import java.util.*;

public class ARecoveringASmallString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            while(sb.length() < 3){
                int remaining = 2 - sb.length();
                if(n - 1 <= remaining * 26){
                    sb.append('a');
                    n--;
                }
                else{
                    int x = n - remaining * 26;
                    sb.append((char) ('a' + x - 1));
                    n -= x;
                }
            }
            System.out.println(sb);
        }
    }
}