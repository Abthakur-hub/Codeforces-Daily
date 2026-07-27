import java.util.*;

public class ACurrencySystemInGeraldion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ok = false;

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x == 1) ok = true;
        }

        System.out.println(ok ? -1 : 1);
    }
}