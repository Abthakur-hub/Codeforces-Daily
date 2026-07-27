import java.util.*;

public class AParallelepiped{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = (int)Math.sqrt((x*z)/y);
        int b = (int)Math.sqrt((x*y)/z);
        int c = (int)Math.sqrt((y*z)/x);
        System.out.println(4*(a+b+c));
    }
}