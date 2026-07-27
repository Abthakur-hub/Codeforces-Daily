import java.util.*;

public class AMagicalSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            long a = sc.nextLong();
            if(a<=2)System.out.println(1);
            else{
                if(a%2==0) System.out.println(a/2);
                else System.out.println(a/2+1);
            }
        }
    }
}