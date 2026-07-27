import java.util.*;

public class AShortSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            String s = sc.next();

            Boolean flag = false;

            for(int i=0; i<3; i++){
                if(s.charAt(i)==(char)(97+i)) flag = true;
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}