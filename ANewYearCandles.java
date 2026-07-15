import java.util.*;

public class ANewYearCandles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = 0;
        int d = 0;
        while(a > 0){
            h += a;
            d += a;
            a = d / b;
            d %= b;
        }
        System.out.println(h);
    }
}