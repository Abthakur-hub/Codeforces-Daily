import java.util.*;

public class AOddSelection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int o = 0, e = 0;
            for(int i=0; i<n; i++){
                int v = sc.nextInt();
                if(v % 2 == 0)
                    e++;
                else
                    o++;
            }
            boolean ok = false;
            for(int i=1; i<=x; i+=2){
                if(i <= o && x - i <= e){
                    ok = true;
                    break;
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
    }
}