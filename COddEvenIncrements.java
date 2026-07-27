import java.util.*;

public class COddEvenIncrements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int o = -1, e = -1;
            boolean f = true;
            for(int i=1; i<=n; i++){
                int p = sc.nextInt() & 1;

                if((i & 1) == 1){
                    if(o == -1) o = p;
                    else if(o != p) f = false;
                }
                else{
                    if(e == -1) e = p;
                    else if(e != p) f = false;
                }
            }
            System.out.println(f ? "YES" : "NO");
        }
    }
}