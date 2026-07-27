import java.util.*;

public class A_Rewards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cup = 0;
        int medal = 0;
        for(int i=0; i<3; i++){
            int a = sc.nextInt();
            cup+=a;
        }
        for(int i=0; i<3; i++){
            int a = sc.nextInt();
            medal+=a;
        }
        int shelf = sc.nextInt();
        int c = (int)Math.ceil(cup/5.0);
        int m = (int)Math.ceil(medal/10.0);
        if((c+m)<=shelf) System.out.println("YES");
        else System.out.println("NO");

    }
}