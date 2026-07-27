import java.util.*;

public class A_Ultra_Fast_Mathematician{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1 = sc.next();

        String b1 = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<a1.length(); i++){
            if(a1.charAt(i)==b1.charAt(i)) sb.append('0');
            else sb.append('1');
            
        }
        System.out.println(sb);
    }
}