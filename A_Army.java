import java.util.*;

public class A_Army{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n-1];

        for(int i=0; i<n-1; i++) d[i]=sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int step = b-a;
        int years = 0;
        for(int i=0; i<step; i++){
            years+=d[i+a-1];
        }
        System.out.println(years);
    }
}