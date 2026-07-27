import java.util.*;

public class CMrPerfectlyFine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                String s = sc.next();
                if(s.equals("10")){
                    a = Math.min(a, x);
                }
                else if(s.equals("01")){
                    b = Math.min(b, x);
                } 
                else if(s.equals("11")){
                    c = Math.min(c, x);
                }
            }
            int ans = Integer.MAX_VALUE;
            if(a != Integer.MAX_VALUE && b != Integer.MAX_VALUE){
                ans = Math.min(ans, a + b);
            }
            if(c != Integer.MAX_VALUE){
                ans = Math.min(ans, c);
            }
            if(ans == Integer.MAX_VALUE){
                System.out.println(-1);
            } else{
                System.out.println(ans);
            }
        }
    }
}