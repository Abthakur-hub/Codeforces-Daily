import java.util.*;

public class B01Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int zero = 0, one = 0;
            for(char c : s.toCharArray()){
                if(c=='0') zero++;
                else one++;
            }
            int m = Math.min(zero, one);
            System.out.println(m%2==0?"NET":"DA");
        }
    }
}