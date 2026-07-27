import java.util.*;

public class A_A_B_Again{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            System.out.println(a%10+a/10);

        }
    }
}