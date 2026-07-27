import java.util.*;

public class BDecoding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int a=n;

        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append(s.charAt(0));
        a=a-1;
        while(i<n){
            if(a%2==0){
                sb.insert(0,s.charAt(i));
            }
            else {
                sb.append(s.charAt(i));
            }
            i++;
            a--;
        }
        String S = sb.toString();
        System.out.println(S);
        
    }
}