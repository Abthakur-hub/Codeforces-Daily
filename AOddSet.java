import java.util.*;

public class AOddSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int odd = 0;
            int even = 0;
            for(int i=0; i<2*a; i++){
                int b = sc.nextInt();
                if(b%2==0)even++;
                else odd++;
                
            }
            System.out.println(odd==even?"Yes":"No");
        }
    }
}