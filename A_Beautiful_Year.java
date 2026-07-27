import java.util.*;
public class A_Beautiful_Year{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            n = n+1;
            int a = 0;
            String s = Integer.toString(n);
            outer:
            for(int i = 0 ;i<s.length();i++){
                for(int j = 0 ;j<s.length() && j!=i ;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        a=1;
                        break outer;
                    }
                }
            }
            if(a==0){
                System.out.println(n);
                break;
            }
        }
    }
}