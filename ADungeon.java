import java.util.*;

public class ADungeon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int s = a+b+c;
            if(s%9==0 && Math.min(a,Math.min(b,c))>=s/9){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}