import java.util.*;

public class DColorfulStamp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int a = 0;
            boolean f = true;

            while(a < n){
                if(s.charAt(a) == 'W'){
                    a++;
                    continue;
                }

                boolean r = false, b = false;

                while(a < n && s.charAt(a) != 'W'){
                    if(s.charAt(a) == 'R')
                        r = true;
                    else
                        b = true;

                    a++;
                }

                if(!(r && b)){
                    f = false;
                    break;
                }
            }

            System.out.println(f ? "YES" : "NO");
        }
    }
}