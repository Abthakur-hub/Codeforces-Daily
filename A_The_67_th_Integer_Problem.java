import java.util.*;

public class A_The_67_th_Integer_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            if(a>-67 && a<67){
                System.out.println(a+1);
            }
            else System.out.println(a);
            
        }
    }
}