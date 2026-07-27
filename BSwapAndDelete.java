import java.util.*;

public class BSwapAndDelete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int z = 0, o = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0')
                    z++;
                else
                    o++;
            }
            int len = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    if(o == 0)
                        break;
                    o--;
                }
                else{
                    if(z == 0)
                        break;
                    z--;
                }
                len++;
            }
            System.out.println(s.length() - len);
        }
    }
}