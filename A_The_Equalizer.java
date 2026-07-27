import java.util.*;

public class A_The_Equalizer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int k = sc.nextInt();
            int sum = 0;
            for(int i=0; i<a; i++){
                int b = sc.nextInt();
                sum+=b;
            }
            if(sum%2!=0) System.out.println("YES");
            else if((a*k)%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}