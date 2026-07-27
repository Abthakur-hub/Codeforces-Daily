import java.util.*;

public class AMakeItWhite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            String s = sc.next();
            int i = 0, j = s.length()-1;
            while(i<s.length()){
                if(s.charAt(i)=='B') break;
                i++;
            }
            while(j>=0){
                if(s.charAt(j)=='B') break;
                j--;
            }
            System.out.println(j-i+1);
        }
    }
}