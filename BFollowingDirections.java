import java.util.*;

public class BFollowingDirections{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int c = sc.nextInt();
            String s = sc.next();
            int a=0,b=0;
            Boolean flag = false;

            for(int i=0; i<c; i++){
                if(s.charAt(i)=='U') a++;
                else if(s.charAt(i)=='D')a--;
                else if(s.charAt(i)=='R')b++;
                else b--;
                if(a==1 && b==1){
                    flag = true;
                }
            }
            if(flag == true) System.out.println("YES");
            else System.out.println("NO");
        }
    
    }
}