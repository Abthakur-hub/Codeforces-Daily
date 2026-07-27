import java.util.*;

public class ACheapTravel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sr = n * a;
        int sp = (n / m) * b;
        int r = (n - ((n / m) * m)) * a;

        int e = ((n / m) + 1) * b;

        System.out.println(Math.min(sr, Math.min(sp + r, e)));
    }
}