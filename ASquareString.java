import java.util.*;

public class ASquareString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-- >0){
            String a = sc.next();
            int b = a.length();

            if(b%2==0){
                String s1 = a.substring(0,b/2);
                String s2 = a.substring(b/2,b);

                System.out.println(s1.equals(s2)?"YES":"NO");

            }
            else System.out.println("NO");
        }
    }
}