import java.util.*;

public class ARook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();

            for(int i=0; i<8; i++){
                if(s.charAt(0)!=(char)(i+97)){
                    char a = (char)(i+97);
                    System.out.println(a +""+ s.charAt(1));
                }
            }
            for(int i=1; i<=8; i++){
                if(s.charAt(1)!=(char)(i+48)){
                    System.out.println(s.charAt(0)+""+ i);
                }
            }
        }
    }
}