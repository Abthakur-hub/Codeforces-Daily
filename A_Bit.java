import java.util.*;

public class A_Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add = 0 ,sub = 0;
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            if(s.contains("+")) add++;
            else sub++;

        }
        System.out.println(add-sub);
    }
}