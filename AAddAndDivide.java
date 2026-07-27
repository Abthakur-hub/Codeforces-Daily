import java.util.*;

public class AAddAndDivide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            for(int i=0; i<=30; i++){
                int c = b + i;
                if(c == 1) continue;
                int d = a;
                int e = i;
                while(d>0){
                    d /= c;
                    e++;
                }
                ans = Math.min(ans, e);
            }
            System.out.println(ans);
        }
    }
}