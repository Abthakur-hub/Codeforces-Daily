import java.util.*;

public class AVanyaAndCubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;
        int need = 1;
        while (n>=need) {
            n-=need;
            h++;
            need += h + 1;
        }
        System.out.println(h);
    }
}