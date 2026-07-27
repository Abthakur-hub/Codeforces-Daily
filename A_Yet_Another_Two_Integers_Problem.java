import java.util.*;

public class A_Yet_Another_Two_Integers_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.abs(b-a);
            System.out.println(c%10==0?c/10:(c/10)+1);
        }
    }
}