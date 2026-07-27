import java.util.*;

public class AVladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int A = 0,B = 0;
            for(char ch:s.toCharArray()){
                if(ch=='A')A++;
                else B++;
            }
            if(A>B)System.out.println("A");
            else System.out.println("B");
        }
    }
}