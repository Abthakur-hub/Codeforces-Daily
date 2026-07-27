import java.util.*;

public class EAlmostRegularBracketSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] v = new int[s.length()];
        if(s.charAt(0) == '('){
            v[0] = 1;
        }
        else{
            v[0] = -1;
        }

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '('){
                v[i] = v[i - 1] + 1;
            }
            else{
                v[i] = v[i - 1] - 1;
            }
        }
        if(v[s.length() - 1] == 0){
            System.out.println(0);
            return;
        }

        int[] sf = new int[s.length()];
        int[] pf = new int[s.length()];

        sf[s.length() - 1] = v[s.length() - 1];
        pf[0] = v[0];

        for(int i=s.length()-2; i>=0; i--){
            sf[i] = Math.min(sf[i + 1], v[i]);
        }

        for(int i=1; i<s.length(); i++){
            pf[i] = Math.min(pf[i - 1], v[i]);
        }

        int c = 0;

        if(v[s.length() - 1] == 2){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    boolean fr = (i == 0 || pf[i - 1] >= 0);
                    boolean se = sf[i] >= 2;

                    if(fr && se){
                        c++;
                    }
                }
            }
        }
        else if(v[s.length() - 1] == -2){
            for(int i=0 ; i<s.length(); i++){
                if(s.charAt(i) == ')'){
                    boolean fr = (i == 0 || pf[i - 1] >= 0);
                    boolean se = sf[i] >= -2;

                    if(fr && se){
                        c++;
                    }
                }
            }
        }

        System.out.println(c);
    }
    
}