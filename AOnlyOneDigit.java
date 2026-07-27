import java.util.*;

public class AOnlyOneDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int min = Integer.MAX_VALUE;
            while(a>0){
                int b = a%10;
                min= Math.min(min, b);
                a=a/10;
            }
            System.out.println(min);
        }
    }
}