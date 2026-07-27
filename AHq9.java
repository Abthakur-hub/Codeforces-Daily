import java.util.*;

public class AHq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        for(char ch:s.toCharArray()){
            if(ch=='H' || ch=='Q' || ch=='9' || ch=='+'){
                flag = true;
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}