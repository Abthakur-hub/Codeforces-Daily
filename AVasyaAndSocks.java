import java.util.*;

public class AVasyaAndSocks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        while(n>0){
            ans++;
            n--;
            if(ans%m==0)
                n++;
        }
        System.out.println(ans);
    }
}