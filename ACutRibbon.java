import java.util.*;

public class ACutRibbon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        for(int i=0; i<=n/a; i++){
            for(int j=0; j<=n/b; j++){
                int rem = n-(i*a+j*b);
                if(rem>=0 && rem%c==0){
                    int k = rem / c;
                    ans = Math.max(ans, i + j + k);
                }
            }
        }
        System.out.println(ans);
    }
}