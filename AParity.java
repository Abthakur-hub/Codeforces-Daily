import java.util.*;

public class AParity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int k = sc.nextInt();

        int p = 0;

        for(int i=0; i<k; i++){
            int x = sc.nextInt();

            if(b % 2 == 1)
                p ^= (x & 1);
            else if(i == k - 1)
                p = x & 1;
        }

        System.out.println(p == 0 ? "even" : "odd");
    }
}