import java.util.*;

public class AYogurtSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int c = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = 0;
            if(c%2==0){
                total = Math.min((c/2) * b,c*a);
            }
            else {
                total = Math.min(((c/2)*b)+a, c*a );
            }
            System.out.println(total);
        }
    }
}