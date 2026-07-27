import java.util.*;

public class AExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m1 = a*b*c;
        int m2 = (a*b)+c;
        int m3 = (a+b)*c;
        int m4 = a+b+c;
        int m5 = a*(b+c);
        int max = Math.max(m1,Math.max(m2,Math.max(m3,Math.max(m4,m5))));
        System.out.println(max);
    }
}